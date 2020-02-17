package com.javanorth.javanorthapp.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TestController {

    @RequestMapping("/test")
    public Map test() {
        Map<String, String> map = new HashMap<>();
        map.put("article", "## 实用的Java编程技巧之命名攻略\n" +
                "\n" +
                "### 一、命名工具推荐\n" +
                "\n" +
                "> 1.命名神器：[CODELF](https://unbug.github.io/codelf/)\n" +
                ">\n" +
                "> 2.翻译神器：[Google translate](https://translate.google.cn/)\n" +
                ">\n" +
                "> 3.国内比较良心的翻译工具：[有道翻译](http://fanyi.youdao.com/)\n" +
                "\n" +
                "### 二、命名策略\n" +
                "\n" +
                "1.命名，命名应该使用纯英文命名，而不使用拼音或者不明其意的英语表达。\n" +
                "\n" +
                "**正例:** life/game\n" +
                "\n" +
                "**反例:** shenghuo/youxi\n" +
                "\n" +
                "2.包名定义，包名应该使用小写，每一个点之间仅有一个自然单词，且每一个自然单词应该使用单数形式。\n" +
                "\n" +
                "**正例:** net.java.util\n" +
                "\n" +
                "**反例:** net.java.utils\n" +
                "\n" +
                "3.类名定义，类名使用**UpperCamelCase**风格，但**DO/BO/DTO/PO/VO/UID等业务类型除外**。\n" +
                "\n" +
                "**正例:** Book/BookService/BookDTO/TcpService\n" +
                "\n" +
                "**反例:** BookDto/BookSERVICE/TCPService\n" +
                "\n" +
                "4.方法名、参数名、成员变量、局部变量都使用**lowerCamelCase**风格。\n" +
                "\n" +
                "**正例:** getName()/userInformation\n" +
                "\n" +
                "**反例:** GetName()/UserInformation\n" +
                "\n" +
                "5.常量命名，常量命名使用大写命名，且每个单词间使用下划线\"_\"进行分割。\n" +
                "\n" +
                "**正例:** SUM_COUNT/MAX_VALUE\n" +
                "\n" +
                "**反例:** Sum_Count/MAXVALUE\n" +
                "\n" +
                "6.抽象类使用Abstract/Base开头，异常处理类使用Exception类结尾，测试类使用Test结尾。\n" +
                "\n" +
                "**正例:** AbstractMessage/MessageException\n" +
                "\n" +
                "**反例:** Message/MessageExcep/TestMessage\n" +
                "\n" +
                "7.枚举类命名，应该以Enum结尾，且枚举类中成员名称需要全部使用大写,且单词之间使用下划线\"_\"进行分割。\n" +
                "\n" +
                "**正例:** ErrorMessageEnum  \n" +
                "\n" +
                "**正例:** SUCCESS/FAILED\n" +
                "\n" +
                "**反例:** ErrorMessage\n" +
                "\n" +
                "**反例:** success/failed\n" +
                "\n" +
                "8.定义数组类型，类型应与中括号紧紧相连。\n" +
                "\n" +
                "**正例:** int[] message, String[] agrs\n" +
                "\n" +
                "**反例:**  int message[], String args[]\n" +
                "\n" +
                "9.接口的方法和属性不加任何修饰符(包括public也不加)，并且使用javadoc对每个接口或者属性进行注释说明。\n" +
                "\n" +
                "**正例:**\n" +
                "\n" +
                "```java\n" +
                "/** \n" +
                " * 获取用户信息 \n" +
                " */\n" +
                "void getUserInformation();\n" +
                "```\n" +
                "\n" +
                "**反例:**\n" +
                "\n" +
                "```java\n" +
                "//获取用户信息\n" +
                "public void getUserInformation();\n" +
                "```\n" +
                "\n" +
                "10.对于接口和实现类的命名约束。\n" +
                "\n" +
                "①.对于DAO类和Service类，基于SOA理念，暴露出来的一定是接口，内部实现类使用Impl进行实现。\n" +
                "\n" +
                "**正例:** MessageDAO/MessageService接口对应MessageDAOImpl与MessageServiceImpl实现类\n" +
                "\n" +
                "```java\n" +
                "public interface MessageDAO {\n" +
                "    /**     \n" +
                "     * 用于发送信息     \n" +
                "     */    \n" +
                "    void send();\n" +
                "}\n" +
                "```\n" +
                "```java\n" +
                "public class MessageDAOImpl implements MessageDAO {\n" +
                "    @Override\n" +
                "    public void send() {\n" +
                "        //todo\n" +
                "    }\n" +
                "}\n" +
                "```\n" +
                "\n" +
                "**反例:** MessageDAO类与MessageService类\n" +
                "\n" +
                "```java\n" +
                "public class MessageDAO {\n" +
                "    public void send() {\n" +
                "        //todo\n" +
                "    }\n" +
                "}\n" +
                "```\n" +
                "\n" +
                "②.如果接口表示能力，应该取名为对应的形容词接口(推荐)。\n" +
                "\n" +
                "**正例:** Comparable/Translatable\n" +
                "\n" +
                "**反例:** Translate\n" +
                "\n" +
                "备注：以上内容来自于阿里巴巴开发手册[阿里巴巴Java开发手册](https://yq.aliyun.com/download/2720?utm_content=m_1000019584)\n" +
                "\n" +
                "| faf   | fasfda | fdasfdas |\n" +
                "| ----- | ------ | -------- |\n" +
                "| afdas | fsafas | fdsafa   |\n" +
                "|       |        |          |\n" +
                "|       |        |          |d");
        return map;
    }
}
