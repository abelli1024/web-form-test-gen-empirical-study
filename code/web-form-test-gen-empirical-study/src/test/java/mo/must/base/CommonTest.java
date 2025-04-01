package mo.must.base;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import mo.must.processor.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CommonTest {

    public static void println(String logFormat, Object... logValue) {
        LogPrintProcessor.print(logFormat, logValue);
    }

    public static String buildHtmlFormElementInclude(List<HtmlFormElement> formElements) {
        if (CollectionUtil.isEmpty(formElements)) {
            return "";
        }
        Map<String, Integer> countMap = new HashMap<>();
        for (HtmlFormElement formElement : formElements) {
            String key = formElement.getType() + "_" + formElement.getTag();
            Integer count = countMap.get(key);
            countMap.put(key, count == null ? 1 : count + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String[] keyArr = StringUtils.split(entry.getKey(), "_");
            if (keyArr.length <= 0) {
                continue;
            }
            String item = entry.getValue() + " " + keyArr[0] + " " + (keyArr.length >= 2 ? keyArr[1] : "");
            list.add(item);
        }
        String inlcludeStr = "";
        for (int i = 0; i < list.size(); i++) {
            inlcludeStr += (i == list.size() - 1) ? list.get(i) : list.get(i) + " and ";
        }
        return inlcludeStr;
    }

    public static String buildChatStructInclude(List<ChatStruct> chatStructList) {
        if (CollectionUtil.isEmpty(chatStructList)) {
            return "";
        }
        Map<String, Integer> countMap = new HashMap<>();
        for (ChatStruct chatStruct : chatStructList) {
            String key = chatStruct.getInputType() + "_" + chatStruct.getElementType();
            Integer count = countMap.get(key);
            countMap.put(key, count == null ? 1 : count + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String[] keyArr = StringUtils.split(entry.getKey(), "_");
            if (keyArr.length <= 0) {
                continue;
            }
            String item = entry.getValue() + " " + keyArr[0] + " " + (keyArr.length >= 2 ? keyArr[1] : "");
            list.add(item);
        }
        String inlcludeStr = "";
        for (int i = 0; i < list.size(); i++) {
            inlcludeStr += (i == list.size() - 1) ? list.get(i) : list.get(i) + " and ";
        }
        return inlcludeStr;
    }

    public static String chat(String model, String content) {
        println("begin chat");
        String chat = ChatProcessor.chat(model, content);
        println("end chat");
        return chat;
    }

    public static String numberToOrdinal(int number) {
        if (number <= 0) {
            return "Invalid number";
        }
        switch (number % 100) {
            case 11:
            case 12:
            case 13:
                return number + "th";
            default:
                switch (number % 10) {
                    case 1:
                        return number + "st";
                    case 2:
                        return number + "nd";
                    case 3:
                        return number + "rd";
                    default:
                        return number + "th";
                }
        }
    }

    public static String processChatStructTaskContent(List<ChatStruct> chatStructList) {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = 0; i < chatStructList.size(); i++) {
                ChatStruct chatStruct = chatStructList.get(i);
                String inputId = chatStruct.getInputId();
                String elementType = chatStruct.getElementType();
                String inputType = chatStruct.getInputType();
                String placeholder = chatStruct.getPlaceholder();
                String inputValue = chatStruct.getInputValue();
                String inputName = chatStruct.getInputName();

                if (StringUtils.isBlank(inputId) && StringUtils.isBlank(inputName)) {
                    continue;
                }

                sb.append("For the ").append(numberToOrdinal((i + 1))).append(" ");
                sb.append(inputType).append(" ").append(elementType).append(",").append(" ");
                if (!StringUtils.isBlank(placeholder)) {
                    sb.append("the hint text is ").append(placeholder).append(",").append(" ");
                }
                if (!StringUtils.isBlank(inputId)) {
                    sb.append("and the element id is ").append("``").append(inputId).append("``.").append(" ");
                }
                if (StringUtils.isBlank(inputId) && !StringUtils.isBlank(inputName)) {
                    sb.append("and the element name is ").append("``").append(inputName).append("``.").append(" ");
                }
                if (!StringUtils.isBlank(inputValue)) {
                    sb.append("and the element default value is ").append("``").append(inputValue).append("``.").append(" ");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String processHtmlFormElementTaskContent(List<HtmlFormElement> formElements) {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = 0; i < formElements.size(); i++) {
                HtmlFormElement chatStruct = formElements.get(i);
                String inputId = chatStruct.getId();
                String elementType = chatStruct.getTag();
                String inputType = chatStruct.getType();
                String placeholder = chatStruct.getPlaceholder();
                String inputValue = chatStruct.getValue();
                String inputName = chatStruct.getName();

                if (StringUtils.isBlank(inputId) && StringUtils.isBlank(inputName)) {
                    continue;
                }

                sb.append("For the ").append(numberToOrdinal((i + 1))).append(" ");
                sb.append(inputType).append(" ").append(elementType).append(",").append(" ");
                if (!StringUtils.isBlank(placeholder)) {
                    sb.append("the hint text is ").append(placeholder).append(",").append(" ");
                }
                if (!StringUtils.isBlank(inputId)) {
                    sb.append("and the element id is ").append("``").append(inputId).append("``.").append(" ");
                }
                if (StringUtils.isBlank(inputId) && !StringUtils.isBlank(inputName)) {
                    sb.append("and the element name is ").append("``").append(inputName).append("``.").append(" ");
                }
                if (!StringUtils.isBlank(inputValue)) {
                    sb.append("and the element default value is ").append("``").append(inputValue).append("``.").append(" ");
                } else {
                    if ("select".equals(elementType)) {
                        String htmlFormOptionElementDefaultVal = getHtmlFormOptionElementDefaultVal(chatStruct.getOptions());
                        if (!StringUtils.isBlank(htmlFormOptionElementDefaultVal)) {
                            sb.append("and the element default value is ").append("``").append(htmlFormOptionElementDefaultVal).append("``.").append(" ");
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String getHtmlFormOptionElementDefaultVal(List<HtmlFormOptionElement> options) {
        if (CollectionUtil.isEmpty(options)) {
            return null;
        }
        for (HtmlFormOptionElement option : options) {
            if (option.isSelected()) {
                return option.getValue();
            }
        }
        return null;
    }

    public static void sendStyle0WebGuiRecord(BaseDTO baseDTO) {
        Map<String, String> bodyParam = new HashMap<>();
        bodyParam.put("webName", baseDTO.getWebName());
        bodyParam.put("formTitle", baseDTO.getFormTitle());
        bodyParam.put("formSource", baseDTO.getFormSource());
        bodyParam.put("style", "0");
        bodyParam.put("chatModel", baseDTO.getChatModel());
        bodyParam.put("oneChatPrompt", "");
        bodyParam.put("oneChatContent", "");
        bodyParam.put("twoChatContent", baseDTO.getTwoChatContent());
        println("sendTwoWebGuiRecord, param:{}", JSON.toJSONString(bodyParam));
        String pkId = WebGuiProcessor.send(bodyParam);
        println("sendTwoWebGuiRecord, pkId:{}", pkId);
        println("--------------------------分割线------------------------------");
    }

    public static void sendStyle1WebGuiRecord(BaseDTO baseDTO) {
        Map<String, String> bodyParam = new HashMap<>();
        bodyParam.put("webName", baseDTO.getWebName());
        bodyParam.put("formTitle", baseDTO.getFormTitle());
        bodyParam.put("formSource", baseDTO.getFormSource());
        bodyParam.put("style", "1");
        bodyParam.put("chatModel", baseDTO.getChatModel());
        bodyParam.put("oneChatContent", baseDTO.getOneChatContent());
        bodyParam.put("twoChatContent", baseDTO.getTwoChatContent());
        println("sendTwoWebGuiRecord, param:{}", JSON.toJSONString(bodyParam));
        String pkId = WebGuiProcessor.send(bodyParam);
        println("sendTwoWebGuiRecord, pkId:{}", pkId);
        println("--------------------------分割线------------------------------");
    }

    public static void sendStyle2WebGuiRecord(BaseDTO baseDTO) {
        Map<String, String> bodyParam = new HashMap<>();
        bodyParam.put("webName", baseDTO.getWebName());
        bodyParam.put("formTitle", baseDTO.getFormTitle());
        bodyParam.put("formSource", baseDTO.getFormSource());
        bodyParam.put("style", "2");
        bodyParam.put("chatModel", baseDTO.getChatModel());
        bodyParam.put("oneChatContent", baseDTO.getOneChatContent());
        bodyParam.put("twoChatContent", baseDTO.getTwoChatContent());
        println("sendTwoWebGuiRecord, param:{}", JSON.toJSONString(bodyParam));
        String pkId = WebGuiProcessor.send(bodyParam);
        println("sendTwoWebGuiRecord, pkId:{}", pkId);
        println("--------------------------分割线------------------------------");
    }

}
