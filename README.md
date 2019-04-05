# Java_Study

## 作者：冰红茶  
## 参考书籍：《Java编程思想》第四版  《Java核心技术》卷一和卷二 原书第10版
    
------    
    
记得一年前由于项目需要，急匆匆的拿一本《Java从入门到精通》边学边写StarCCM+的插件。该书实战性很强，就是内容比较浅薄。所以今天又啃起了编程思想，断断续续花了两周时间看了大概看了一半，剩余的内容后面将由JVM和多线程和Hadoop三本书补充完整。大数据的基础是Java和Linux，以后尽管进不了大数据的领域，也希望能借助此基础进入后端领域^_ ^

## 目录
## [一、简介](#1)
### [1.1 对象导论](#1.1)
## [二、Java的基本程序设计结构](#2)
### [2.1 一个简单的Java应用程序](#2.1)
### [2.2 数据类型](#2.2) 
### [2.3 变量](#2.3)
### [2.4 运算符](#2.4) 
### [2.5 字符串](#2.5) 
### [2.6 输入与输出](#2.6)
### [2.7 正则表达式](#2.7) 
### [2.8 大数值](#2.8)
### [2.9 数组](#2.9)
## [三、初始化与清理](#3)
### [3.1 初始化](#3.1)
### [3.2 清理](#3.2)
## [四、对象和类的介绍](#4)
### [4.1 介绍](#4.1)
### [4.2 用户自定义类](#4.2)
### [4.3 对象构造](#4.3)
### [4.4 访问权限](#4.4)
### [4.5 复用类](#4.5)
## [五、继承、覆盖、多态、接口和抽象](#5)
### [5.1 覆盖](#5.1)
### [5.2 多态](#5.2)
### [5.3 用继承进行设计](#5.3)
### [5.4 抽象](#5.4)
### [5.5 接口](#5.5)
## [六、内部类](#6)
### [6.1 介绍](#6.1)
### [6.2 匿名内部类和嵌套类](#6.2)
### [6.3 普通内部类](#6.3)
## [七、异常、断言和日志](#7)
### [7.1 概念](#7.1)
### [7.2 异常](#7.2)
### [7.3 捕获异常与创建自定义异常](#7.3)
### [7.4 断言](#7.4)
### [7.5 日志](#7.5)
## [八、泛型程序设计](#8)
### [8.1 定义简单的泛型类](#8.1)
### [8.2 泛型代码与虚拟机](#8.2)
### [8.3 约束与局限性](#8.1)
## [九、集合](#9)
### [9.1 介绍](#9.1)
## [十、反射](#10)
### [10.1 介绍](#10.1)
## [十一、部署Java应用程序](#11)
### [11.1 介绍](#11.1)
### [11.2 网络](#11.2)
### [11.3 脚本、编译与注解处理](#11.3)
### [11.4 安全](#11.4)
## [十二、类型信息与注解](#12)
### [12.1 类型信息](#12.1)
### [12.2 Class对象](#12.2)
### [12.3 空对象](#12.3)
### [12.4 注解](#12.4)
## [十三、并发](#13)
### [13.1 留在写《Java多线程编程核心技术》时候再补充](#13.1)
## [十四、JVM](#14)
### [14.1 留在写《深入理解Java虚拟机》时候再补充](#14.1)
## [十五、输入与输出](#15)
### [15.1 Java SE8 的流库](#15.1)
### [15.2 输入和输出](#15.2)
### [15.3 操作文件](#15.3)
## [十六、数据库编程](#16)
### [16.1 介绍](#16.1)
## [十七、项目经验](#17)
### [17.1 介绍](#17.1)
        
------      
        
<h2 id='1'>一、简介</h2>
<h3 id='1.1'>1.1 对象导论</h3>  
        
#### 1) Java程序执行与运行环境
>>>>>> ![Java程序执行与运行环境](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-1%20Java%E7%A8%8B%E5%BA%8F%E6%89%A7%E8%A1%8C%E4%B8%8E%E8%BF%90%E8%A1%8C%E7%8E%AF%E5%A2%83.jpg?raw=true)
                
#### 2) UML图
>>>>>> ![图1-2 UML图](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-2%20UML%E5%9B%BE.jpg?raw=true)
                
#### 3) 复用的具体体现
>>>>>> ![图1-3 复用的具体体现1](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-3%20%E5%A4%8D%E7%94%A8%E7%9A%84%E5%85%B7%E4%BD%93%E4%BD%93%E7%8E%B01.jpg?raw=true)
                
>>>>>> ![图1-3 复用的具体体现2](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-3%20%E5%A4%8D%E7%94%A8%E7%9A%84%E5%85%B7%E4%BD%93%E4%BD%93%E7%8E%B02.jpg?raw=true)
                
#### 4) 对象的创建与生命周期
>>>>>> ![图1-4 对象的创建与生命周期](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-4%20%E5%AF%B9%E8%B1%A1%E7%9A%84%E5%88%9B%E5%BB%BA%E4%B8%8E%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F.jpg?raw=true)
                
#### 5) 数据类型
>>>>>> ![图1-5 数据类型](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-5%20%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B.jpg?raw=true)
                
#### 6) 包装类
>>>>>> ![图1-6 包装类](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE1-6%20%E5%8C%85%E8%A3%85%E7%B1%BB.jpg?raw=true)
        

------      
        
<h2 id='2'>二、Java的基本程序设计结构</h2>
<h3 id='2.1'>2.1 一个简单的Java应用程序</h3>  
        
#### 1) 一个简单的Java应用程序
> - class类名应采用驼峰式命名 每个单词的首字母大写
> - 源文件名需和公共类名相同，后缀为.java
> - 程序将从类中的main方法开始执行，所以main方法必须是public和静态的，与C/C++相同的是，void表示无返回值，不同的是，main方法没有为操作系统返回“退出代码”，如果正常退出则返回0。如果希望返回其他代码，则需要调用System.exit方法
> - 
                
                /**
                 - 
                 */
                package practice;
                /**
                 - @author LvHongbin

                 *
                 */
                public class HelloWorld {

                    /**
                     - @param args
                     */
                    static String s1 = "你好";  // 回车不是结束，可以写多行
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                        String s2 = "Java";
                        System.out.println(s1);     //System.out.println输出后换行
                        System.out.println(s2);     //System.out.print输出后不换行
                    }
                }

                你好
                Java

                
<h3 id='2.2'>2.2 数据类型</h3>  
        
#### 1) 整数类型
> - Java是一种强数据类型，意味着必须为每个变量声明一种类型，在Java中每一种有8种基本类型
> - 整形有四种 byte(1字节)，short(2字节)，int(4字节)，long(8字节)
> - 在Java中，整形的范围与运行Java代码的机器无关，这就解决了软件从一个平台移植到另一个平台、一个操作系统移植给另外一个操作系统的诸多问题
> - 没有无符号的unsigned
                
#### 2) 浮点类型
> - float(4字节)，double(8字节)，float类型的数值有一个后缀F或者f，没有后缀的默认是double类型，当然了可以在后面添加D或者d
> - 其他特殊的浮点数值：
>> - 正无穷大(正整数/0), Double.POSITIVE_INFINITY
>> - 负无穷大(负整数/0), Double.NEGATIVE_INFINITY
>> - NaN(0/0或者负数的平方根，不是一个数字), Double.NaN    
                
                // 不能使用if条件判断是不是非数值，因为所有非数值都不想等
                // 但是可以使用Double.isNaN(x) 来检查
                if(x == Double.NaN) 

#### 3) char类型
> - 字面量需要用单引号括起来，也可以用转义序列\u表示，从\u0000到\Uffff
> - 还有其他特殊的转义字符
>>>>>> ![图2-2 特殊字符的转移序列.png](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE2-2%20%E7%89%B9%E6%AE%8A%E5%AD%97%E7%AC%A6%E7%9A%84%E8%BD%AC%E7%A7%BB%E5%BA%8F%E5%88%97.png?raw=true)
                
#### 4) boolean类型
> - true和false
> - 需要注意的是，在C++中，数值甚至是指针可以替代boolean值，0相当于false，非0相当于true。但是在Java中没有这个便利。因为在Java中无法隐式地将int值转换为boolean。
                
                if(0) {
                    System.out.println(0);
                }

                Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
                    Type mismatch: cannot convert from int to boolean

                    at practice.HelloWorld.main(HelloWorld.java:21)

                
<h3 id='2.3'>2.3 变量</h3>  
        
#### 1) 变量
> - 必须使用赋值语句对变量进行显式初始化，否则会报错
> - 在C++中是严格区分声明和定义的
                
                int i = 10  // 这是一个定义
                extern int i    // 这是一个声明
> - 在Java中变量初始化等效于C++的定义  
#### 2) 常量
> - final表示常量，一旦被初始化，就不能再更改其值，一般用大写字母表示
> - 数学函数Math类， Math.sqrt(x); Math.pow(x, a); Math.sin(x); Math.cos(x); Math.E; Math.PI;
       
<h3 id='2.4'>2.4 运算符</h3>  
        
#### 1) 数值类型的转换表
> - 从大字节转换为小字节会造成信息丢失
#### 2) 强制类型转换
> - 在圆括号中填写需要转换的目标数据类型
> -  Math.round()得到最接近的整数，但是由于返回值为long类型，需要进行强制转换
                
                 (int)Math.round(x);

        
#### 3) 位运算符
> - 先转换为二进制，再按位模式进行处理
                
                &("and") |("and") ^("xor") ~("not")

                System.out.println(1 & 0b0000010);

                0
> - 在布尔值上，跟&& 和 ||不同的是，&和|没有短路的功能，两个操作数都需要计算完毕，而&& 和 ||可以只看第一个数做出判断
> - 右移>>、 左移<<   >>>运算符会用0填充高位，不存在<<<运算符 在数字没有溢出的前提下，对于正数和负数，左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方。
        
#### 4) 枚举类型
> - enum 
> - 枚举的集合类型名称可以自定义，可以储存某个枚举值或者null值，null值就表示这个变量没有设置任何值
                
                enum Size {SAMLL, MEDIUM, LARGE, EXTRA_LARGE};
                Size s = null;
                s = Size.MEDIUM

                MEDIUM

       
<h3 id='2.5'>2.5 字符串</h3>  
        
#### 1) 字串substring
> - 优点，容易计算字串的长度，如3 = 3 - 0
                
                String greeting = "hello";
                String str = greeting.substring(0,3);
                System.out.println(str);

                hel
#### 2) 拼接
> - 直接使用 + 号 用于String的“+”与“+=”是Java中仅有的两个重载过的操作符，而Java并不允许程序员重载任何的操作符
> - 或者使用join方法，用一个定界符分割多个字串
                
                String all = String.join("/", "S", "M", "A", "L", "L");
                System.out.println(all);

                S/M/A/L/L
#### 3) 不可变字符
> - 不可变，任何一个看起来修改String值的方法，实际上都是创建了一个全新的String对象，以包含修改后的字符串内容，而最初的String对象则丝毫未动。
> - 每当把String对象作为方法的参数的时候，实际上传递的是引用的拷贝，对于不使用的引用，系统会进行自动回收。
> - 具有只读属性
#### 4) 检测字符串是否相等
> - equals()
> - 不能使用==，因为==只检测“指针”是否相等，实际上不同的字符串常量拥有不同的指针
                String greeting = "hello";
                String str = greeting.substring(0,3) + "lo";
                System.out.println(str.equals(greeting));
                System.out.println(str == greeting);

                true
                false
#### 5) 空串和null串
> - 检测空串的方法
                
                String none = "";
                if(none != null && none.length() == 0) {
                    System.out.println("none是空串");
                }else if(none != null && none.length() != 0) {
                    System.out.println("none不是null也不是空串");
                }else {
                    System.out.println("none是null");
                }

                none是空串

            
#### 6) 码点与代码单元
> - 代码点：是指一个编码表中的某个字符对应的代码值，也就是Unicode编码表中每个字符对应的数值。Unicode标准中，代码点采用16进制书写，并加上前缀U+，比如字符A对于的编码值是U+0041，Unicode的代码点可以分成17个代码级别。第一个代码级别称为基本的多语言级别，代码点从U+0000到U+FFFF，其中包括了经典的Unicode代码，其余的16个附加级别，代码点从U+10000到U+10FFFF，其中包括了一些增补字符[————夏雨的竹子](https://blog.csdn.net/u010411264/article/details/45258629)。
> - 则是针对编码方法而言，它指的是编码方法中对一个字符编码以后所占的最小存储单元。例如UTF-8中，代码单元是一个字节，因为一个字符可以被编码为1个，2个或者3个4个字节；在UTF-16中，代码单元变成了两个字节（就是一个char），因为一个字符可以被编码为1个或2个char（你找不到比一个char还小的UTF-16编码的字符，嘿嘿）。说得再罗嗦一点，一个字符，仅仅对应一个代码点，但却可能有多个代码单元（即可能被编码为2个char）。[————滴水成川](https://blog.csdn.net/xiaofei125145/article/details/50818343)。
> - length方法返回的是采用UTF-16编码表示的给定字符串所需要的代码单元数量
> - codePointCount方法返回的是码点数量
                
                String greeting = "hello";
                System.out.println(greeting.codePointCount(0, greeting.length()));

                5
> - charAt(n)方法返回第n个位置的代码单元
                
                String greeting = "hello";
                System.out.println(greeting.charAt(1));

                e
#### 7) 常用的方法
> - length()
> - charAt() // 返回索引位置上的char
> - contentEquals() equalsIgnoreCase // 比较String内容
> - reginMatcher() // 参数是该Sting的索引偏移量，另一个String极其索引偏移量，要比较的长度，返回Boolean结果
> - concat()
> - replace("旧的字符串", "新的字符串")
> - indexOf()
> - trim() //删除前后空格
> - valueOf() // 返回一个表示参数内容的String
> - 其实从返回值可以看出，当要改变字符串内容的时候，都会返回一个新的对象
> - toLowerCase()
> - toUpperCase()
> - join("分界字符", "各个分解的字符"...)
#### 8) 构建字符串
> - 普通的短字符进行频繁连接的时候，使用普通的“+”会使得效率低下，因为会频繁创建新的String对象，既耗时又浪费空间，但是使用StringBuilder类就可以壁面这个问题。
> - StringBuilder类的前身是StringBuffer，效率稍低，但是可以在多线程中执行添加或者删除字符的操作，如果在单线程中最好还是要用StringBuilder类
                
                long startTime, endTime;
                // 常规方法
                startTime = System.currentTimeMillis();
                String mix = "";
                for(int i = 0; i < 100000; i++) {
                    mix = mix + i;
                }
                // System.out.println(mix);
                endTime = System.currentTimeMillis(); 
                System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

                // StringBuilder类方法
                startTime = System.currentTimeMillis();
                StringBuilder builder = new StringBuilder();
                for(int i = 0; i < 100000; i++) {
                    builder.append(i);
                }
                // System.out.println(builder.toString());
                endTime = System.currentTimeMillis(); 
                System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); 
                
                // StringBuffer类方法
                startTime = System.currentTimeMillis();
                StringBuffer buffer = new StringBuffer();
                for(int i = 0; i < 100000; i++) {
                    buffer.append(i);
                }
                // System.out.println(buffer.toString());
                endTime = System.currentTimeMillis(); 
                System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

                程序运行时间：7304ms
                程序运行时间：1ms
                程序运行时间：113ms

       
<h3 id='2.6'>2.6 输入与输出</h3>  
                 
#### 1) 输入
> - Scanner类
>> - 新建实例时需要添加InputStream类, 如System.in和java.nio.file.Paths
>> - 需要注意的是，next()、nextInt()等方法会将换行号掉到下一个输入中去，导致如果下一个输入还是nextInt()等方法的话会被直接执行，所以最后在每一个nextInt()等方法后加一个nextLine()方法用来吸收掉下来的换行符。
                
                Scanner in = new Scanner(System.in);
                System.out.println("Please input your name：");
                String name = in.nextLine();
                String sex = in.next();
                int age = in.nextInt();
                System.out.println("\n" + name + "先生,\n性别：" + sex + ",\n年龄："+ age + "。");
                // Console con = System.console();
                // String username = con.readLine("username: ");
                // char[] passward = con.readPassword("Passward: "); 

                吕鸿斌先生,
                性别：男,
                年龄：24。

> - console类，用来输入密码用的，不能在常规的eclipse控制台中使用

#### 2) 格式化输出
> - System.out.format()
>> - 用于PrintStream和PrintWriter对象；
>> - format()跟printf()等价
                
                System.out.format("Row 1: [%d %f]\n", x, y);
                System.out.printf("Row 1: [%d %f]\n", x, y);
> - Formatter类
>> - 在Java中，所有新的格式化功能都由java.util.Formatter类处理
                                
                PrintStream outAlias = System.out;
                private Formatter f = new Formatter(outAlias);
                f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
>> - 格式化说明符
                
                // width: 一个域的最小尺寸
                // precision: 应用于String时，表示打印String时输出的字符的最大数量；应用于浮点数的时候，表示小数部分要显示出来的位数（默认是6位小数），但是无法应用于整数，否则会触发异常
                // 默认是右对齐，不过可以通过使用“-”标志来改变方向
                %[argument_index$][flags][width][.precision]conversion
>>>>>> ![图11-1 Formatter_Sample](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-1%20Formatter_Sample.png?raw=true)
> - 常用的类型转换字符
>> - d 整数型（十进制）
>> - c Unicode字符
>> - b boolean值
>> - s String 
>> - f float(十进制)
>> - e 浮点数（科学计数）
>> - x 整数（十六进制）
>> - h 散列码（十六进制）
>> - % 字符“%”
> - 使用类型转换字符时需要注意合法性。Boolean只要参数不是null，都会返回true，否则返回false
> - String.format()
>> - 参考了C中的sprintf()的方法，已生成格式化的String对象。
>> - 它是一个static方法，接受与Formatter.format()方法一样的参数，但是返回的是一个String对象
>> - 内部的话也是创建一个Formatter对象，然后讲参数传给它。但是使用String.format()的话就会便捷很多
#### 3) 文件的输入和输出
> - 输入文件时，需要在scanner类中构建文件类
                
                try {
                    @SuppressWarnings("resource")
                    Scanner file = new Scanner(Paths.get("C:\\Users\\Lv Hongbin\\Desktop\\StartWeChat.bat"), "UTF-8");
                    System.out.println("StartWeChat.bat: " + file.nextLine());
                }catch(Exception e) {
                    System.out.println("Exception e: " + e);
                }finally{
                    
                }

                StartWeChat.bat: start E:\"Program Files (x86)"\Tencent\WeChat\WeChat.exe

> - 写入文件时，需要实例化PrintWriter类，然后项System.out那样使用print、println以及printf
>> - 如果写入文件名的文件不存在，则自动创建
>> - 文件使用完一定要关闭哦，否则写不尽内容
                
                PrintWriter pw = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\PrintWriter.txt", "UTF-8");
                pw.print("PrintWriter");
                pw.close();

<h3 id='2.7'>2.7 正则表达式</h3>  
        
#### 1) 使用方法
> - 内建功能进行判断 String.matches("自己的正则表达式");
                
                “1234”.matches("-?\\d+");
> - split()，“将字符串从正则表达式匹配的地方切开”，返回剩余的字符串。他还有一个重载的版本，它允许你限制字符串分隔的次数
                

                "nihao1234".split("\d+"); // "nihao"

        
> - replaceFirst("正则表达式", "用于替换的词") replaceAll("正则表达式", "用于替换的词")替换
>>>>>> ![图11-2 正则表达式](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-2%20%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F.png?raw=true)
#### 2) 量词
> - 描述一个模式吸收输入文本的方式
> - 贪婪型  * + {n,} 默认情况是贪婪模式匹配
> - 勉强型（或者叫懒惰型，非贪婪型）?跟在 * + {n,} 等的后面时，表示非贪婪模式
> - 占有型 只有Java语言独有，贪婪型在尽可能匹配字符串的时候加入匹配不成功会进行回溯，但是占有型却相反，不会进行回溯，所以有时候会出现贪婪型匹配成功，但是占有型一个都匹配不成功的情况出现 [java学习笔记001之正则表达式贪婪型、勉强型和占有型p299](https://blog.csdn.net/mushao999/article/details/46331145)
>>>>>> ![图11-3 量词的分类](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-3%20%E9%87%8F%E8%AF%8D%E7%9A%84%E5%88%86%E7%B1%BB.png?raw=true)
#### 3) Pattern和Matcher
> - 可以自定义构造一个功能强大的正则表达式对象，只需要导入java.util.regex包；
> - 然后使用static Pattern.compile()方法来编译你的正则表达式，根据String类型的正则表达式生成一个Pattern对象
> - Pattern.compile()接受两个参数，第一个参数是正则表达式，第二个参数是flag，常用的flag有如下几个
>>>>>> ![图11-4 常用的正则表达式flag1](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-4%20%E5%B8%B8%E7%94%A8%E7%9A%84%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8Fflag1.png?raw=true)
>>>>>> ![图11-4 常用的正则表达式flag2](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-4%20%E5%B8%B8%E7%94%A8%E7%9A%84%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8Fflag2.png?raw=true)
> - Pattern.compile().split() // 分隔
> - Pattern.compile().replaceAll() // 替换全部
> - Pattern.compile().replaceFirst() // 替换第一个匹配组
> - > - Pattern.compile().appendReplacement(StringBuffer sbuf, String replacement) // 执行渐进式替换
                
                /**
                 * 
                 */
                package com.sjtu.javaStudy;

                import java.util.regex.Matcher;
                import java.util.regex.Pattern;

                /**
                 * @author hblvs
                 *
                 */
                public class javaTest {

                    /**
                     * @param args
                     */
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                         String regex = "\\b[^A-W && ^\\S].+?\\b";
                         String input = "123 lvhongbin Apple Banana pear Orange";
                         Pattern p = Pattern.compile(regex);
                         Matcher m = p.matcher(input);
                         while(m.find()) {
                             System.out.println(m.group() + m.start() + m.end());
                         }
                    }
                }

                // output
                12303
                lvhongbin413
                pear2731
> - Matcher.matches()/ Matcher.lookingAt()/ Matcher.find()
> - Matcher.matches() // 需要整个输入都匹配才成功
> - Matcher.find() // 参数可以输入index的位置，表示从那往后开始匹配
> - Matcher.lookingAt() // 只要输入的第一部分匹配成功即可
> - Matcher.lookingAt() // 将现有的Matcher对象应用于一个新的字符序列

Matcher类提供三个匹配操作方法,三个方法均返回boolean类型,当匹配到时返回true,没匹配到则返回false  [gdwkong的博客 java Pattern和Matcher详解](https://www.cnblogs.com/gdwkong/articles/7782331.html)
> - Pattern标记
#### 4) 扫描输入
> - java.io
> - StringRreader将String转化为可读大的流对象，然后用这个对象来构造BufferReader对象。因为我们要使用BufferReader的readLine()方法。
> - 还有一个功能更加强大的Scanner类，使用BufferReader作为输入，应该是做了一层封装，方便直接把扫描到的内容转换成所需要的类型
> - 实际上Scanner类可以接收任意输入类型作为参数，包括Readable对象，File对象，InputStream和String
> - Scanner类还可以配合pattern正则表达式进行扫描
> - 需要注意的是StringReader用过之后需要重新新建才能把光标复位
> - 
                
                /**
                 * 
                 */
                package com.sjtu.javaStudy;
                import java.io.BufferedReader;
                import java.io.StringReader;
                import java.util.Scanner;
                import java.util.regex.Matcher;
                import java.util.regex.Pattern;

                /**
                 * @author hblvs
                 *
                 */
                public class javaTest {
                    
                    private static BufferedReader buffer(String str) {
                        BufferedReader bf = new BufferedReader(new StringReader(str));
                        return bf;
                    }

                    /**
                     * @param args
                     */
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                         String regex = "\\b[^A-W && ^\\S].+?\\b";
                         String input = "123 lvhongbin Apple Banana pear Orange";
                         Pattern p = Pattern.compile(regex);
                         Matcher m = p.matcher(input);
                         while(m.find()) {
                             System.out.println(m.group() + m.start() + m.end());
                         }
                         String userInfo = "lvhongbin\n25\n0.809015";
                         BufferedReader bf = buffer(userInfo);
                         try {
                             boolean isEnd = false;
                             while(!isEnd) {
                                 String myName = bf.readLine();
                                 if(myName != null) {
                                     System.out.println(myName); 
                                 }else {
                                     isEnd = true;
                                 }
                             }
                         }catch (Exception e) {
                             e.printStackTrace();
                         }
                         @SuppressWarnings("resource")
                         Scanner scanner = new Scanner(userInfo);
                         String name = scanner.nextLine();
                         int age = scanner.nextInt();
                         double favorite = scanner.nextDouble();
                         System.out.format("Hi, %s\n", name);
                         System.out.format("In 5 years, you will be %d.\n", age + 5);
                         System.out.format("My favorite number is %f.\n", favorite / 2);
                         
                         // Scanner配合正则表达式
                         @SuppressWarnings("resource")
                         Scanner scannerRegEx = new Scanner(userInfo);
                         while(scannerRegEx.hasNext("[a-z]+")) {
                             scannerRegEx.next(".+");
                             System.out.println(scannerRegEx.match().group(0));
                         }
                    }
                }

                // output 
                12303
                lvhongbin413
                pear2731
                lvhongbin
                25
                0.809015
                Hi, lvhongbin
                In 5 years, you will be 30.
                My favorite number is 0.404508.
                lvhongbin

                

       
<h3 id='2.8'>2.8 大数值</h3>  
                 
#### 1) BigInteger大整数
> - BigInteger BigInteger.add(BigInteger, other)
> - BigInteger BigInteger.subtract(BigInteger, other)
> - BigInteger BigInteger.multiply(BigInteger, other)
> - BigInteger BigInteger.divide(BigInteger, other)
> - BigInteger BigInteger.mod(BigInteger, other)
> - int BigInteger.compareTo(BigInteger, other)
#### 2) BigDecimal大实数
> - BigDecimal BigDecimal.add(BigDecimal, other)
> - BigDecimal BigDecimal.subtract(BigDecimal, other)
> - BigDecimal BigDecimal.multiply(BigDecimal, other)
> - BigDecimal BigDecimal.divide(BigDecimal, other)
> - int BigDecimal.compareTo(BigDecimal, other)
> - BigDecimal static BigDecimal.valueOf(long x)

       
<h3 id='2.9'>2.9 数组</h3>  
                 
#### 1) 数组介绍
> - 数组是一种数据结构
> - 声明：数据类型 + []
> - 初始化：new 数据类型[n]，其中n表示数组规模。需要注意的是，数字数组初始化的时候全部为0，boolean数组的元素会为false，对象数组和字符串数组为null。如果需要制定特定的初始化数值，需要使用循环赋值的方式。或者使用对象+大括号方式，又或者直接使用大括号的方式。
> - for(int element: a)增强型for循环，读作“循环a中的每一个元素”
                
                try {
                    int[] arrayInt = new int[]{1, 2 , 3, 4, 5};
                    @SuppressWarnings("resource")
                    PrintWriter outputArray = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\outputArray.txt", "UTF-8");
                    for(int element: arrayInt) {
                        outputArray.println(element);
                    }
                    outputArray.close();
                }catch(Exception e) {
                    System.out.println("Exception e: " + e);
                }finally {
                    
                }

                1
                2
                3
                4
                5
> - Java允许数组规模为0，但是此不等于null
> - Java数组与C++数组在堆栈上有很大的不同，但是基本上与分配在堆(heap)上的数组指针一样
                
                // 即：
                int array = new array[10] //Java

                // 等同于，但是没有指针运算，不能通过+1获取下一个元素
                int* array = new array[10] //C++
                // 不同于
                int array[10] //C++

#### 2) 数组拷贝
> - 浅拷贝，直接把一个数组的引用赋值给另外一个数组，那么当改变其中一个数组的值的时候，另外一个数组也会随之改变。
> - 深拷贝，使用Array.copyOf(Array, length)或者使用循环赋值的方式
#### 3) 命令行参数
> - 我们平常见得非常多的main方法中的参数String arg[]，其实就是命令行中调用java程序后面跟着的参数
#### 4) 高维数组
> - 使用[]\[\]和{{}}
> - 增强型for循环需要进行嵌套
                

------      
        
<h2 id='3'>三、初始化与清理</h2>
<h3 id='3.1'>3.1 初始化</h3>  
        
#### 1) 总体思路
>>>>>> ![图3-1 初始化与清理](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE3-1%20%E5%88%9D%E5%A7%8B%E5%8C%96%E4%B8%8E%E6%B8%85%E7%90%86.jpg?raw=true)
>>>>>> ![图3-2 初始化与清理](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE3-2%20%E5%88%9D%E5%A7%8B%E5%8C%96%E4%B8%8E%E6%B8%85%E7%90%86.jpg?raw=true)
>>>>>> ![图3-3 初始化与清理](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE3-3%20%E5%88%9D%E5%A7%8B%E5%8C%96%E4%B8%8E%E6%B8%85%E7%90%86.jpg?raw=true)
>>>>>> ![图3-4 初始化与清理](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE3-4%20%E5%88%9D%E5%A7%8B%E5%8C%96%E4%B8%8E%E6%B8%85%E7%90%86.jpg?raw=true)
        

        
        
------      
        
<h2 id='4'>四、对象和类</h2>
<h3 id='4.1'>4.1 介绍</h3>  
        
#### 1) OOP面向对象程序
> - Pascal语言的设计者Niklaus Wirth说过：“算法+数据结构=程序”
> - 以前传统的结构化程序是将算法作为重点，然后是数据储存
> - OOP则是将数据放在前面，然后再考虑如何操作数据
> - 类构造对象的过程称为创建类的实例
>>>>>> ![图5-1 面向过程和OOP的比较.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE5-1%20%E9%9D%A2%E5%90%91%E8%BF%87%E7%A8%8B%E5%92%8COOP%E7%9A%84%E6%AF%94%E8%BE%83.jpg?raw=true)
                
#### 2) 封装encapsulation
> - 将数据和行为组合在一个保重，并对对象的使用者隐藏了数据的实现方式
>> - 实例域instance field 对象中的数据
>> - 方法method 用于操纵对象以及存取他们的实例域
>> - 状态state 无论何时，向对象发送一个消息，他的状态就有可能发生改变
> - 关键：**绝对不能**让一个类中的方法直接访问其他类的实例域，封装给对象赋予了黑盒的特征，提高重用性和可靠性
#### 3) OOP的三个特征
> - 对象的行为 可以对对象施加哪些操作或者施加那些方法，即添加响应
> - 对象的状态 当施加这些方法后，对象如何相应，即输出
> - 对象的标识 如何分辨具有相同行为和状态的不同对象
#### 4) 类之间的关系
> - 依赖（“uses-a”）应尽可能地将依赖减少，即降低耦合度
> - 聚合（“has-a”）
> - 继承（“is-a”）
        
>>>>>> ![图5-2 表达关系的UML符号.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE5-2%20%E8%A1%A8%E8%BE%BE%E5%85%B3%E7%B3%BB%E7%9A%84UML%E7%AC%A6%E5%8F%B7.jpg?raw=true)
        
#### 5) 其他
> - 所有的对象作为局部变量时不会自动初始化为null，而必须通过调用new或者设置为null值进行初始化
> - 所有的Java对象都存储在堆中
#### 6) 更改器
> - 调用该方法会改变对象的状态
#### 7) 访问器
> - 只访问对象而不修改对象的方法称为访问器  
                
<h3 id='4.2'>4.2 用户自定义类</h3>  
       
#### 1) 形式
> -   
                
                class ClassName {
                    field1
                    field2
                    ...
                    constructor1
                    constructor2
                    ...
                    method1
                    method2
                }                                

        
#### 2) 构造器
> - 构造器与类同名
> - 每一个类中可以有一个以上的构造器
> - 构造器可以有0个，1个或者多个参数
> - 构造器没有返回值
> - 构造器没有返回值
> - 构造器总是伴随着new操作一起调用
> - 构造器中不要定义与实例域重名的局部变量
#### 3) 隐式参数和显式参数
> - 显式参数：明显在方法中声明
> - 隐式参数：调用的是对象的实例域，前面加上this.
#### 4) 实例域和域的操纵
> - 一个私有的数据域
> - 一个公有的域访问器方法
> - 一个公有的域更改器方法
#### 5) 方法参数
> - 一个方法不能修改一个基本数据类型的参数，因为它在传值的时候是使用参数的拷贝
> - 一个方法可以改变一个对象参数的状态，因为拷贝过来的对象引用本质上指向的还是原来的内容
> - 一个方法不能让对象参数引用一个新的对象。
> - 引用对象的参数调用看似是引用调用，不过本质上还是值传递，传递是拷贝的对象引用
#### 5) 其他
> - 不要编写返回引用可变对象的访问器方法，即实例域是一个对象，然后方法中改变了这个对象，最后在访问器中返回了这个被改变的对象。之所以不要这样写，是因为会破坏了封装性。如果确实要返回这样的对象，请务必事先对他进行克隆clone
> - 基于类的访问权限：一个方法可以访问所属类的所有对象的私有数据，不仅仅是它自己的实例，还是整个类的所有实例
> - finial实例域的对象只针对对象的引用，对象里面的值是可以被改变的
> - static静态域  static静态域属于类，而不属于任何独立的对象，可以认为是公共变量
> - static静态方法不能访问非静态实例域
                
<h3 id='4.3'>4.3 对象的构造</h3>  
       
#### 1) 重载
> - 方法名和参数叫做方法的签名
> - 不仅可以用在构造器中，还可以用在任何的方法
#### 2) 默认域初始化
> - 如果在构造器中没有显式地初始化实例域，那么构造器将会自动地赋予默认值，数值为0，布尔值为false，对象和字符串为null。
> - 这也是实例域和局部变量不同的地方，局部变量必须初始化否则编译检查的时候不会通过，而实例域则不必如此，当然手动初始化会更好。最好在构造器中进行初始化。
#### 3) 默认构造器
> - 当且仅当没有提供任何的构造器的时候，Java才会提供一个默认的而且是无参的构造器。但是假如没有提供无参构造器却提供了有参的构造器，而且后面你又调用无参构造器，此时就会出错，因为无参构造器此时并没有默认被构建。这一点需要注意。
#### 4) this
> - this可以用来指代类的实例的隐性参数，即实例域
> - 放在一个构造器中也可以用来调用另一个构造器，这也是跟C++不同的地方，C++不能这样用，只能抽取公共代码。形如
                
                Class ClassName {
                    public ClassName() {
                        ...
                    }
                    public ClassName(type i) {
                        this(); // 调用无参构造器
                        ...
                    }
                    ...
                }
#### 5) 初始化块
> - 初始化实例域有三种方式
>> - 默认初始化
>> - 所有域初始化
>> - 使用初始化块进行初始化
>> - 构造器初始化
#### 6) hasCode方法
> - 散列码
> - 定义在Object类中，每个对象有一个默认的散列码，其值就是对象的存储地址。相同的对象的散列码值必须相等。
> - 字符串的散列码是由字符串内容决定的，只要内容相同，那么不管如何创建，其散列值都会相等
> - 字符串缓冲StringBuilder类没有定义散列值的方法，用的是Object的方法 
            
<h3 id='4.4'>4.4 访问权限与控制</h3>  
        
#### 1) 介绍
> - 包内包含有一组类，在单一的名字空间之下被组织在一起
> - 比如：全名是java.util.ArrayList
> - 使用的时候利用import关键字
                
                import java.util.ArrayList;
                import java.util.*
> - 一个Java源文件通常被称为是编译单元，带后缀名.java。内部有且仅被允许有一个public类，否则编译器不会接受。在编译单元之中还有额外的类的话，那么在包之外的世界是无法看见这些雷达额。因为他们不是public类，而且他们只要用来为主public类提供支持。
> - package名称的第一部分是类的创建者的反顺序Internet域名
#### 2) 代码组织
> - java可运行程序是一组可以打包并压缩为一个Java文档文件(JAR，使用Java的jar文档生成器)的.class文件。Java解释器负责这些文件的查找
> - 解释器运行过程：
>> - 找出环境变量CLASSPATH，通过CLASSPATH查找.class文件的根目录，
>> - 从根目录开始，解释器获取包的名称并将每个句点替换成斜杆或者反斜杠(这个取决于系统)，以从CLASSPATH根中产生一个路径名称
> - 得到的路径会与CLASSPATH中的各个不同的项相连接，解释器就在这些目录中查找与你所要创建的类的名称相关的.class文件。
#### 3) 包访问权限
> - public：则包内外都能访问
> - protected： 继承的类也能访问，但是包外非继承的类则不能访问
> - 包访问权：默认没有修饰关键词，可以访问包内的类，但是对包外则为private
> - private：类私有
#### 4) 接口和实现
> - 具体实现的隐藏：访问权限的控制
> - 封装：把数据和方法包装紧类中，以及具体实现的隐藏，其结果是一个同时带有特征和行为的数据类型。
> - 封装的原因：
>> - 一方面是设定客户端程序员可以使用和不可以使用的界限
>> - 另一方面是将接口和具体实现进行分离，客户端程序员除了可以想接口发送消息之外什么都不可以做，避免破坏客户端代码
#### 5) 一般做法
> - 将public成员至于开头，后面跟着protected、包访问权和private成员
#### 6) 类的访问权限
> - 每一个编译单元都只能有一个public类，作为单一的公共接口，如果一个编译单元内有一个或者多个public类，编译器就会给出出错消息
> - 类的公共接口的名称必须跟该编译单元的文件名相匹配，包括大小写，如果不匹配也会报错；
> - 虽然不常用，但是编译单元内完全不带public也是可能的，可以随意对文件命名
                
<h3 id='4.5'>4.5 复用类</h3>  
        
#### 1) 四种方法
> - 组合，由现有类的对象所组成
> - 继承 
>> - 需要在构造器中调用基类构造器来初始化基类
>> - 构建过程是从基类“向外”扩散的，所有基类在导出类构造器可以访问它之前就已经完成了初始化。
>> - 编译器会为你合成一个默认的无参构造器，并自动调用
>> - 但是如果你要初始化有参的构造器，则必须借助关键字super.
> - 代理 这个用得比较少，并没有使用extends关键字，而是直接在类中实现继承类，然后继承实例的某些方法
> - 结合使用组合和继承
        
#### 2) 确保正确的清理
> -                                              析构函数是C++中的概念，指的是对象被销毁时自动被调用的函数。
#### 3) 向上转型
> - 由导出类转换为基类，在UML图上显示的是向上移动。
> - 特点：从一个较为专用的类型向通用的类型转换，所以总是安全的
> - 唯一可能发生的事情是丢失方法
> - 如果一个方法是private，他就不是接口，导出类无法覆盖该方法。即便你在导出类以相同的名称不同的修饰关键字（protected or public or 包访问权限）
#### 4) final关键字
> - 通常指“这是无法改变的”
> - 适用范围：数据、方法和类
> - 数据：一个永不改变的编译时常量，或者是运行时被初始化的值，而你不希望它被改变。所以这类常量必须是基本数据类型，而且在定义的时候，必须对其进行赋值
> - 一个既是static又是final的域只占据一段不能改变的存储空间
> - 类或者数组：final使对象引用恒定不变，一旦引用被用于初始化指向一个对象或者数组，就无法再把它改为指向另一个对象。然而，对象本身却是可以被修改的。
> - 方法：好处有两个
>> - 第一把方法锁定，以防止任何继承类修改它的含义，这是处于设计的考虑，保持不变且不会被覆盖；
>> - 第二个原因是效率，但是这种能提高效率的观点是早期提出的。当编译器发现一个final方法的时候，它会进行非常谨慎的判断。跳过执行方法调用机制（将参数压入栈，跳至方法代码处执行，然后跳回并清理栈中的参数，处理返回值）而采用插入程序代码的方式，即内嵌调用，以方法体中实际代码的副本替代方法调用，以消除方法调用的开销。但是如果你的方法很大，程序代码就会膨胀，因而有可能看不到内嵌带来的任何性能的提高。
> - 空白final：即被声明为final但是又未给定初值的域。这样的好处是可以适应不同的对象，而又保持其恒定不变的特性。
> - final和private关键字的比较：类中所有的private都隐晦地指定为final，这是因为在类外无法覆盖它，对private方法添加final修饰词，并不能给该方法增加任何额外的意义；
#### 5) 初始化及类的加载
> - 传统的语言中的顺序
>> - 程序作为启动过程一部分立刻被加载；
>> - 初始化，需要注意，如果某个static期望另一个static在被初始化之前就能有效地使用它，那么就会出现问题
>> - 程序运行
> - Java中就不会存在上述初始化的问题，因为Java中所有的事物都是对象，每个类的编译代码都存在与他自己的独立文件中，该文件只在需要使用程序代码时才会被加载，即加载发生于创建类的而第一个对象之时。“类的代码在初次使用时才加载”。初次使用之处也是static初始化发生之处。这就有效保证了类之间的依赖问题。
        

        
------      
        
<h2 id='5'>五、继承、覆盖、多态、接口和抽象</h2>
<h3 id='5.1'>5.1 覆盖</h3>  
        
#### 1) super
> - 只是一个指示端编译器调用超类方法的特殊关键字
> - 子类的构造器写上super()这一句是用来初始化超类实例域
> - 如果子类构造器没有显式地调用超类的构造器进初始化，则会默认调用超类的无参构造器，假如此时又不幸地出现超类只有有参构造器没有无参构造器的时候，编译器就会出错。
> - 有人说super跟this的作用类似，其实这么说是不对的。因为this相当于对象引用，利用this可以用来指代类的实例的隐性参数，即实例域；放在一个构造器中也可以用来调用另一个构造器。而super只能用来调用超类的方法或者调用超类的构造器(只限第一条语句出现)。
#### 2) 覆盖
> - 覆盖就是子类用了跟超类同名的方法
> - 但是有一个问题是，子类无法调用超类的实例域，这就会造成无法完全覆盖的问题，这是因为在如果想调用超类实例域，必须借助超类公开的方法。那怎么借助超类公开的方法呢？这时候可以借助super关键字。
                
                Class Parent {
                    private int n;
                    public Parent(n) {
                        this.n = n;
                    }
                    public int getN() {
                        System.out.println("n = " + n);
                        return n;
                    }
                }

                Class Son {
                    public int getN() {
                        int n = super.getN();
                        System.out.println("n = " + n);
                        return n;
                    }
                }

> - 假设子类跟超类的某个方法签名相同，但是返回类型不同，也可以覆盖，因为签名只考察方法名和参数列表不考察返回类型，此时我们称这两个方法具有可协变的返回类型。
> - 继承还有一个非常重要而又经常被人忽视的点是：子类要覆盖超类的方法时可见性不能低于超类。
> - 阻止继承，使用private、static和final方法或者构造器
                
<h3 id='5.2'>5.2 多态</h3>  
        
#### 1) 介绍
> - 数据在OOP中的三个特征：抽象，继承和多态；
> - “封装”通过合并特性和行为来创建新的数据类型；
> - 多态（polymorphism）指一个对象变量可以指示多种实际类型的现象，表明每个子类的对象都是超类的对象，满足"is-a"原则
> - 动态绑定（dynamic binding）在运行时能够自动地选择调用哪个方法的现象。
#### 2) 再论向上转型
> - 主要问题是向上转型时会忘记本身的类型是什么
                
                public void play(Instrument a) {
                    print("Instrument");
                }
> - 解决办法：方法调用绑定
>> - 绑定：将一个方法调用同一个方法主体关联起来
>> - 前期绑定：在程序执行前进行绑定，面向过程的语言不要选择就默认的绑定方式
>> - 后期绑定：程序运行时根据对象的类型进行绑定，Java中除了static方法和final方法之外，其他所有方法都是后期绑定。使用final方法除了可以防止别人覆盖，还可以有效地关闭动态绑定
>> - 静态绑定：使用private、static和final方法或者构造器，那么编译器将可以准确地知道应该调用哪个方法
>> - 动态绑定：调用的方法依赖隐式参数的实际类型。虚拟机会事先为每个类列出所有方法的签名（包括方法名和参数列表）和实际调用的方法，叫做方法表。然后根据方法表去匹配签名，找到该方法后进行调用。这样的好处是有利于程序进行拓展，遇到方法表中相同签名方法的时候不需要重新进行编译即可使用。
> - 其实给我的感觉，后期绑定和覆盖方法有点类似
> - 有一点需要注意的是，Parent.field和Son.field并不是多态，因为编译器给他们分配了不同的存储空间。实际上Son类拥有两个field域，如果需要得到Parent.field，需要显式指明为Super.field
                
                Class Parent {
                    public int field = 0;
                }

                Class Son extends Parent{
                    public int field = 1;
                }
 
#### 3) 构造器的调用顺序
> - 在其他任何事物发生之前，将分配给对象的存储空间初始化为二进制的零
> - 调用基类构造器，从根开始往下调用到最底层的导出类。调用时有可能会出现基类方法被导出类覆盖，但是初始值却为基类的默认值而非导出类的初始值的现象。
> - 按声明顺序调用成员的初始化方法。
> - 调用导出类构造器的主体
>>>>>> ![图6-1 构造器调用顺序的困惑.png](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE6-1%20%E6%9E%84%E9%80%A0%E5%99%A8%E8%B0%83%E7%94%A8%E9%A1%BA%E5%BA%8F%E7%9A%84%E5%9B%B0%E6%83%91.png?raw=true)
#### 4) 构造器内部的多态方法的行为
> - 如果要调用构造器内部的一个动态绑定的方法，但是这个方法有可能会被覆盖，那调用的结果就难以预测了，有可能会相当的难以预料
> - 所以编写构造器的时候有一条有效的准则：“用尽可能简单的方法使对象进入正常的状态，如果可以的化，避免调用其他方法”
> - 构造器中唯一可以被安全调用的只有基类的final方法或者private方法。
#### 5) 协变返回类型
> - 存在两组继承类组合A1，A2，B1，B2，其中A2覆盖A1中的某个方法，B1，和B2中的方法分别返回A1，和A2的方法，这样做的话A1的方法就不会被覆盖。我觉得这不是明显的吗？为什么还要搞一个这么高大上的名字。
> - 其实按照后期的理解，协变返回类型指的应该是返回值是别的类

        
<h3 id='5.3'>5.3 用继承进行设计</h3>  
        
#### 1) 一条通用的准则
> - 用继承表达行为间的差异，并用字段表达状态上的变化
> - 纯继承与拓展
>> - 纯继承是一种纯粹的“is-a”关系，导出类只覆盖基类的方法，不独自创造新的方法
>> - 拓展继承“is-like-a”,向上转型会丢失部分信息，向下转型不安全的，因为“形状变大了”。要解决向下转型的问题，必须进行转型检查。即便使用加括号形式进行类型转换，在运行时仍然会对其进行检查。称作“运行时类型识别”（RTTI）
                
                (Son)parent.sonDoSomething(); // Exception thrown
    
#### 2) instanceOf
> - 使用instanceOf可以判断是否两个类是否是继承的关系
        
<h3 id='5.4'>5.4 抽象</h3>  
        
#### 1) 抽象类和抽象方法
> - 建立接口的原因：不同的子类可以用不同的方式表示此接口，通用接口建立起一种基本形式。以此表示所有导出类的共同部分
> - 建立抽象类的原因：简单的一个接口几乎是没有任何意义的，因为你无法使用和编译时去测试它。所以Java提供给一个叫做“抽象方法”的机制。这种方法是不完整的，仅有声明没有方法体
                
                abstract void f();
> - 包含抽象方法的类叫做抽象类，如果一个类包含一个或者多个抽象方法，该类必须被限定为抽象，否则编译器会报错
> - 如果从一个抽象类继承，就必须为基类中的所有对象方法提供方法定义。否则，编译器将会强制用abstract关键字来限定这个类。
> - 抽象类里面的方法可以不全是抽象的
        
<h3 id='5.5'>5.5 接口</h3>  
        
#### 1) 接口
> - Interface是一种更加纯粹的抽象类。
> - Interface这个关键字产生一个极度抽象的类，他根本没有提供任何具体的实现
> - 接口的每一个方法确实都只是一个声明，这是编译器所允许的在接口中唯一能够存在的事物。
#### 2) 实现接口的步骤
> - 将类声明为实现给定的接口
> - 对接口中的所有方法进行定义
                
                /**
                 * 
                 */
                package practice;

                /**
                 * @author LvHongbin
                 *
                 */
                public interface Generic<T, U> {
                    
                    public void setFirst(T first);
                    public void setSecond(U second);
                }


                /**
                 * 
                 */
                package practice;

                /**
                 * @author LvHongbin
                 *
                 */
                public class GenericClass<T, U> implements  Generic<String, Integer> {  //泛型类
                    private T first;
                    private U second;
                    
                    public GenericClass() {
                        first = null;
                        second = null;
                    }
                    
                    public GenericClass(T first, U second) {
                        this.first = first;
                        this.second = second;
                    }

                    /**
                     * @return the first
                     */
                    public T getFirst() {
                        return first;
                    }

                    /**
                     * @param first the first to set
                     */
                    @SuppressWarnings("unchecked")
                    public void setFirst(String first) {
                        this.first = (T) first;
                    }
                    
                    /**
                     * @return the second
                     */
                    @SuppressWarnings("unchecked")
                    public <S> S getSecond() {  //泛型方法
                        return (S) second;
                    }

                    /**
                     * @param second the second to set
                     */
                    @SuppressWarnings("unchecked")
                    public void setSecond(Integer second) {
                        this.second = (U) second;
                    }
                }

        
#### 3) 接口的特性
> - 接口无法使用new进行实例化，因为它不是一个类
> - 接口中没有任何方法被声明是public的，但是它们自动就是public的。不过在实现接口的时候必须把方法添加public，不然就会默认为包可见性
> - 接口可以使用extends对另一个接口进行拓展
> - 不能包含实例域和静态方法，常规方法是可以的
> - 接口可以一次实现多个，在implements后面的接口用逗号进行分割即可
#### 4) 接口实例
> - ActionListener接口
                
                package practice;

                import java.awt.event.ActionEvent;
                import java.awt.event.ActionListener;
                import java.util.Date;

                /**
                 * @author LvHongbin
                 *
                 */
                public class Worker implements ActionListener {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        System.out.println("At the tone, the time is " + new Date());
                    }
                }

> - Comparable接口
> - Cloneable接口
>> - Cloneable接口
>> - 重新定义clone方法，并指定public访问修饰符
>>>>>> ![图5-3 Cloneable接口.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE5-3%20Cloneable%E6%8E%A5%E5%8F%A3.jpg?raw=true)
                
#### 5) 完全解耦
> - 策略设计模式：能够根据所传递的参数对象的不同而具有不同行为的方法。这类方法包含所要执行算法中固定不变的部分，而“策略”就是传递进去的参数对象。
>>>>>> ![图7-1 策略设计模式.png](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-1%20%E7%AD%96%E7%95%A5%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.png?raw=true)
> - 适配器模式：其实是使用了代理
> - 工厂模式
>>>>>> ![图7-3 工厂模式1](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-3%20%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F1.png?raw=true)
>>>>>> ![图7-3 工厂模式2](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-3%20%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F2.png?raw=true)
                
#### 6) Java中的多重继承
> - 接口是一种更加纯粹的抽象类，因为接口根本没有任何具体的实现，没有任何与接口相关的存储，也就无法阻止多个接口的组合；
                
                class Hero extends ActionCharacter implements implementsA, implementsB, implementsC
>>>>>> ![图7-2 Java中的多重继承](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-2%20Java%E4%B8%AD%E7%9A%84%E5%A4%9A%E9%87%8D%E7%BB%A7%E6%89%BF.png?raw=true)
                
#### 7) 面向接口编程
> - 原因：
>> - 为了能够向上转型为多个基类型
>> - 防止客户端程序员创建该类的对象，并确保这仅仅是一个接口
#### 8) 通过继承来拓展接口和接口中的域
> - 直接正在接口后面跟extends关键字，多个继承使用逗号作为分割；
> - 注意避免多个接口中方法名字的冲突
#### 9) 接口中的域
> - 放入接口中的任何域都是自动static和final的
> - 所以接口就成为一种很便捷的用来创建常量组的工具
> - 而且不需要添加private或者final或者static关键字
> - 不能是“空final”，但是可以接受被非常量表达式初始化
> - 嵌套在另一个接口中的接口自动就是public的
#### 10) lambda表达式
> - 形式
                
                (arg1, arg2, ...) -> {
                    // todo somethings
                }
> - 无需指定返回类型，lambda表达式会自动判断
> - lambda表达式捕获的变量必须时最终变量，即不会受外界影响而改变
> - 其实就是函数式编程
                
                Timer t = new Timer(1000, event -> System.out.println("At the tone, the time is " + new Date()));
        
------      
        
<h2 id='6'>六、内部类</h2>
<h3 id='6.1'>6.1 介绍</h3>  
        
#### 1) 内部类是什么
> - 将一个类的定义放在另一个类的定义内部，类似于一种代码隐藏机制
> - 允许把一些逻辑相关的类组织在一起，并控制位于内部的类的可视性
> - 内部类和组合是完全不同的概念
> - 如果要在外部使用非静态方法创建某个内部类对象，则需要具体指明这个对象的类型：OuterClassName.InnerClassName
> - 普通的内部类不能有static数据和static字段，也不能包含嵌套类。这是因为内部类不是static的话，里面的方法和字段是static又有什么用。
> - 创建内部成员类的时候，需要使用“外围类”  + “.” + “new”语法
#### 2) 为什么需要内部类
> - 每个内部类都能独立继承一个接口的实现，所以无论外围类是否已经继承了某个接口的实现，对内部类都没有影响
> - 内部类使得多重继承的解决方案变得完整
> - 内部类方法可以访问该类定义所在的作用于中的数据，包括私有数据
> - 内部类可以对同一个包中的其他类隐藏起来
> - 当项定义一个回调函数且不想编写大量代码的时候，使用匿名内部类比较便捷
#### 3) 内部类的继承
> - 继承自内部类的时候需要使用特殊的语法进行初始化，否则编译会不通过
                
                enclosingClassReference.super();
#### 4) 内部类的标识符
> - 由于每个类都会产生.class文件
> - 内部类都有自己的.class文件，只是该文件的名字是：外围类名字 + “$” + 内部类名字
                
<h3 id='6.2'>6.2 普通内部类</h3>  
        
#### 1) 链接到外部类
> - 可以访问外围对象（其实就是它的上一层嵌套对象）的所有成员（该成员跟内部类处于同一级别），而不需要任何特殊条件
> - 还拥有其外围类的所有元素的访问权一个指向那个外围对象的引用。然后，当你访问这个外围类下对象的时候就是用那个引用来选择外围类的成员
> - 原因是什么：当一个外围类对象创建一个内部对象的时候，此内部独享必定会秘密捕获
> - 通过一个外部类名字 + ‘.’ + this可以链接到外围类对象
                
                如： Outer.this // 表示外围类的引用，如果单独是一个this的话则表示内部类
#### 2) 内部类和向上转型
> - 使用内部类来隐藏使用的接口，关键是使用协同返回
> - 内部类前添加private，那么除了外围类没有其他可以访问；如果内部类前添加protected，那么是由外围类及其子类，还有与外围类同一个包中的类能够访问
>>>>>> ![图7-4 内部类隐藏接口](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-4%20%E5%86%85%E9%83%A8%E7%B1%BB%E9%9A%90%E8%97%8F%E6%8E%A5%E5%8F%A3.png?raw=true)
#### 3) 在方法和作用域内的内部类
> - 在方法作用域内创建一个完整的类，这被称作局部内部类
> - 在方法之外无法访问，如果需要return该局部内部类，那么需要把该局部内部类进行继承和实现某接口，然后在使用的时候进行向上转型
                
<h3 id='6.3'>6.3 匿名内部类和嵌套类</h3>  
        
#### 1) 匿名内部类
> - 方法的返回值的生成与表示这个返回值的类的定义结合在一起，其实匿名的是一个已有接口的实现
> - 化简前
>>>>>> ![图7-5 匿名内部类化简前](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-5%20%E5%8C%BF%E5%90%8D%E5%86%85%E9%83%A8%E7%B1%BB%E5%8C%96%E7%AE%80%E5%89%8D.png?raw=true)
> - 化简后
>>>>>> ![图7-6 匿名内部类化简后](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-6%20%E5%8C%BF%E5%90%8D%E5%86%85%E9%83%A8%E7%B1%BB%E5%8C%96%E7%AE%80%E5%90%8E.png?raw=true)
> - 需要注意的是，在匿名内部类内使用的参数必须是在方法定义的时候必须是final的
                
                public class Parcel10 {
                    destination(final String dest, final float price) {
                        return new Destination() {
                            System.out.printIn(dest * price);
                        }
                    }
                }
#### 2) 嵌套类
> - 如果不需要内部对象与其外围对象之间有联系，那么可以将内部类声明为static
> - 不能从嵌套类对象中访问非静态的外围类对象
> - 内部类可以通过一个特殊的this链接到外围类对象，但是嵌套类就没有这个特殊的this引用，使得它的使用跟静态方法类似。
> - 一个内部类被嵌套多少层都并不重要，他都能透明的访问所有它所潜入的外围类的所有成员

         
        
------      
        
<h2 id='7'>七、异常、断言和日志</h2>
<h3 id='7.1'>7.1 概念</h3>  
        
#### 1) 三种处理系统错误的机制
> - 抛出一个异常
> - 日志
> - 使用断言
                
<h3 id='7.2'>7.2 异常</h3>  
        
#### 1) 基本理念
> - “结构不佳的代码不能运行”
> - 对于异常处理的实现最早可以追溯到20世纪60年代的操作系统，设甚至于BASIC语言中的on error goto语句
> - C++的异常处理机制是基于Ada，Java中的异常处理则建立在C++的基础之上
> - 一个明显的好处是，往往可以降低错误处理代码的复杂度，如果不适用异常，那就必须检查特定的错误，并在程序中的许多地方去处理它。而如果使用异常，则就不必在方法调用处进行检查。因为异常机制将把凭证能够捕获这个错误。并且，只需要在一个地方处理错误————即所谓的异常处理程序中。
#### 2) 基本异常
> - 普通问题：在当前环境下能得到足够的信息，总能处理这个错误
> - 异常抛出：在当前环境下无法获得必要的信息来解决问题，只能从当前的环境中跳出，并且把问题提交给上一级的环境。
#### 3）异常抛出后的处理
> - 当异常抛出后，将使用new在堆上创建异常对象。然后在当前执行路径被终止，从当前环境中弹出对异常对象的引用，此时，异常处理机制接管程序，并开始寻找一个恰当的地方来继续执行程序。这个恰当的地方就是**异常处理程序**。它的任务是从错误状态中恢复，以使程序要么换一种方式运行，要么继续运行下去。
#### 4）异常类型
> - 根类：Throwable对象
> - Throwable对象包含Error和Exception异常，Exception异常包括IOException和RuntimeException
>>>>>> ![图7-1 异常类型.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-1%20%E5%BC%82%E5%B8%B8%E7%B1%BB%E5%9E%8B.jpg?raw=true)
                
> - 非受查异常（unchecked）
>> - Error类，Java运行时系统内部错误和资源耗尽错误，其实就是系统内部错误，不是人为造成的
>> - RuntimeException类，可以说是逻辑异常，包括错误的类型转换、数组访问越界、访问null指针。如果出现该异常，说明肯定是你自己的问题。
> - 受查异常（checked）
>> - 其他类的异常。编译器将检查是否为所有受查异常提供了异常处理器
>> - 需要声明受查异常
                
                public void writeFile() throws IOException{
                    BigInteger[] big = {BigInteger.valueOf(1234567890L),BigInteger.valueOf(9876543210L)};
                    PrintWriter pw = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\PrintWriter.txt", "UTF-8");
                    pw.print("authod: " + this.name + "\r\n" + big[0].add(big[1]));
                    pw.close();
                }

        
<h3 id='7.3'>7.3 捕获异常与创建自定义异常</h3>  
        
#### 1) try块
#### 2) 异常处理程序
> - 两种基本模型：终止模型 && 恢复模型
#### 3) 创建自定义异常
> - 要自己定义异常类，必须从已有的异常类继承，最好是选择意思相近的异常类继承。
> - 每个异常类都有两个构造器，一个是默认构造器，另一个是带有String message为参数的有参构造器。
                
                class SimpleException extends Exception {

                }
                punlic class InheritingExceptions {
                    public void f() throws SimpleException {

                    }
                }

                public static void main(String[] args) {
                    InheritingExceptions sed = new InheritingExceptions();
                    try {
                        sed.f();
                    } catch (SimpleException e) {
                        // 处理自定义异常
                    }
                }
#### 4) 捕获所有异常
> - 最简单的方法，最好放在程序列表的末尾，以防它抢在其他处理程序之前把异常捕获        
                
                catch(Exception e) {
                    System.out.printIn("Caught an exception");
                }
> - 但是Exception这个基类不包含太多的信息，不过可以调用其基类Throwable继承的方法来获取详细的信息
                
                String getMessage()
                String getLocalizedMessage()
>>>>>> ![图10-1 容器的分类图](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE10-1%20Exception%E7%9A%84%E4%BD%BF%E7%94%A8.png?raw=true)
#### 5) 栈轨迹
> - printStackTrace()方法所提供的信息可以通过getStackTrace()方法来直接访问。这个方法返回一个由栈轨迹中元素所构成的数组。每个元素都表示栈中的一帧。元素0是栈顶元素。并且是调用序列中最后一个方法调用，数组中的最后一个元素是和栈底是调用序列中的第一个方法调用
> - 打印的时候是从最内层开始到最外层，这就说明是从调用序列中的第一个元素开始打印，第一个元素也是方法的最内层调用，最后一个元素是最外层的调用
>>>>>> ![图10-2 printStackTrack](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE10-2%20printStackTrack.png?raw=true)
#### 6) 重新抛出异常
> - 直接在catch中添加throw e
> - 但是重新抛出后printStackTrace()显示的是原来异常抛出点的调用栈信息，而非重新抛出点的信息，要更新的话需要调用fillLinStackTrace()方法。
#### 7) 异常链
> - 捕获一个异常后抛出另一个异常，然后需要把前一个异常的信息保存下来交给下一个异常，这种传递链就叫做**异常链**
> - 后面讲的东西有点复杂。。。
        
<h3 id='7.4'>7.4 使用断言</h3>  
        
#### 1) 使用场合
> - 断言失败是致命的，不可恢复的错误
> - 断言检查只用于开发和测试阶段用于确定程序内部错误的位置和原因
> - 一般不会在正式发布的时候添加断言，只会用于测试
#### 2) 关键字assert
> - 两种方式，第一种不带AssertionError构造器（没有冒号及其后面那一部分），第二种带AssertionError构造器，并将冒号后面的值作为参数传入转换成一个消息字符串
                
                assert startTime < 0 : "startTime > 0";

                Exception in thread "main" java.lang.AssertionError: startTime > 0 at practice.HelloWorld.main(HelloWorld.java:57)
#### 3) 开启方式
> - 在eclipse中 1.Run -> Run Configurations -> Arguments页签 -> VM arguments文本框中加上断言开启的标志:-enableassertions 或者-ea 就可以了
        
<h3 id='7.5'>7.5 日志</h3>  
        
#### 1) 简介
> - 类似于System.out.println的功能，但是要比它强大很多
> - 实际上其实并没有什么用，还不如System.out.println来得方便
        
------      
        
<h2 id='8'>八、泛型程序设计</h2>
<h3 id='8.1'>8.1 定义简单的泛型类</h3>  
        
#### 1) 类型变量
> - 一个泛型类就是具有一个或者多个类型变量的类
> - 类型变量使用大写形式，且比较短
> - 泛型类可以有多个，用尖括号括起来，放在类名的后面
>> - 泛型可以出现在类的定义中，放在类名的后面，用用尖括号括起来，称为泛型类。泛型类在使用的时候需要在类名前加上尖括号以及尖括号内具体的类型名。
>> - 还有一种是出现在普通类的方法中，放在修饰符（public、static等）的后面，返回类型的前面，称为泛型方法。泛型方法在使用的时候需要在方法名前加上尖括号以及尖括号内具体的类型名。
> - 
                
                /**
                 * 
                 */
                package practice;

                /**
                 * @author LvHongbin
                 *
                 */
                public class GenericClass<T, U> {   //泛型类
                    private T first;
                    private T second;
                    
                    public GenericClass() {
                        first = null;
                        second = null;
                    }
                    
                    public GenericClass(T first, T second) {
                        this.first = first;
                        this.second = second;
                    }

                    /**
                     * @return the first
                     */
                    public T getFirst() {
                        return first;
                    }

                    /**
                     * @param first the first to set
                     */
                    public void setFirst(T first) {
                        this.first = first;
                    }

                    /**
                     * @return the second
                     */
                    @SuppressWarnings("unchecked")
                    public <S> S getSecond() {  //泛型方法
                        return (S) second;
                    }

                    /**
                     * @param second the second to set
                     */
                    public void setSecond(T second) {
                        this.second = second;
                    }
                    
                }

                GenericClass<String, Integer> genericClassc = new GenericClass<String, Integer>();
                genericClassc.setFirst("first");
                genericClassc.setSecond("second");
                System.out.println(genericClassc.getFirst());
                System.out.println(genericClassc.<String>getSecond());

                first
                second

#### 2) 类型变量的限定
> - 有时候我们需要对类型变量作出一些限定，比如继承于某一特定类，此时类型变量称为特定类的**子类型**，可以写成以下格式，如果有多个特定类则使用**&**进行分割
                
                <T extends ClassName1 & ClassName1>
> - **类型擦除** 指的是用具体的类型名对泛型变量进行替换，或者直接删除泛型变量
                
<h3 id='8.2'>8.2 泛型代码与虚拟机</h3> 
                
#### 1) 泛型代码在虚拟机如何操作
> - 虚拟机中没有泛型，只有普通的类
> - 所以，所有的类型参数都是用他们的限定类型进行替换，如果没有限定类型，就用Object进行替换，这个过程称为 **类型擦除**
> - 为了保证安全性，必要时插入强制类型转换
> - 使用桥方法保持多态
                
                // 超类
                Class <T> Pair {
                    // field
                    // constructor
                    // method
                    public T getSecond() {
                        // todo something
                        return (T) second
                    }
                    public void setSecond(T second) {
                        // todo something
                    }
                }
                
                // 子类
                Class DateInterval extends Pair<LocalData> {
                    // constructor
                    // method
                    public LocalData getSecond() {
                        // todo something
                        return (LocalData) second
                    }
                    public void setSecond(LocalData second) {
                        // todo something
                    }
                }

                // 经过类型擦除后，使用桥方法避免类型擦除和多态的冲突

                // 超类
                Class Pair {
                    // field
                    // constructor
                    // method
                    public Object getSecond() {
                        // todo something
                        return (Object) second
                    }
                    public void setSecond(Object second) {
                        // todo something
                    }
                }
                
                // 子类
                Class DateInterval extends Pair {
                    // constructor
                    // method
                    public LocalData setSecond() {
                        return (LocalData) super.setSecond(Object second);
                    }

                    public void setSecond(Object second) {
                        // todo something
                        setSecond((LocalData) second);
                    }
                }

                    
<h3 id='8.3'>8.3 约束与局限性</h3> 
                
#### 1) 不能使用基本类型实例化类型参数
> - 因为类型擦除后，Object不能存储基本类型。一共八种，char、byte、short、int、long、float、double、boolean
> - 所以需要使用其包装类：Character、Byte、Short、Integer、Long、Float、Double、Boolean
#### 2) 运行时类型查询只适用于原始类型
> - 使用instanceof查询一个对象是否属于某个泛型类型时，得到一个编译器错误
> - 使用泛型类型进行强制类型转换时会得到警告
> - getClass方法只会得到原始类型
#### 3) 不能创建参数化类型的数组
> - 即不能通过new方法初始化数组
> - 需要借助ArrayList
                
                // 左边那个是没有问题的，右边那个会报错
                Pair<String>[] p = new Pair<String>[10]

                // 这个也是没有问题的
                Pair<String>[0] = 。。。
#### 4) 不能实例化类型变量
> - 如：new T()
#### 5) 不能构造泛型数组
> - 如：T[]
> - 需要借助ArrayList和反射，这里比较反射，需要深究的可以看《核心》卷1 324页
#### 6) 不能在静态域或者静态方法中引用类型变量
> - 不能在静态域或者静态方法中引用类型变量
#### 7) 不能抛出或者捕获类型变量的实例
> - 但在异常try-catch中普通的使用是没有问题的
> - 但是catch(T e)这种是不行的
#### 8) 其他需要注意的地方
> - 泛型类型的继承规则。假使S与T之间是继承关系，但是Pair<S\>和Pair<T\>并没有什么关系
> - 通配符<? extends Classname\> 不能作为一种类型在变量声明中使用
> - 通配符的超类型限定<? super Classname\>
        
------      
                   
<h2 id='9'>九、集合</h2>
<h3 id='9.1'>9.1 集合</h3>  
        
>>>>>> ![图7-10 容器的分类图](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-10%20%E5%AE%B9%E5%99%A8%E7%9A%84%E5%88%86%E7%B1%BB%E5%9B%BE.png?raw=true)
        
#### 1) 泛型
> - 应用于容器后，表示该容器可容纳的子元素类型，并用尖括号括起来
                
                ArrayList<Apple> apples = new ArrayList<Apple>();
> - 如果没有在该使用泛型的地方使用泛型，就会出现警告信息，提示没有使用泛型。在这里可以使用Java SE5所特有的注解来抑制警告信息。注解以“@”符号开头，可以接受参数，这里的@SuppressWarnings注解极其参数表示只有有关“不受检查的异常”的警告信息应该被抑制
> - 尖括号括起来的**类型参数**指定了这个容器实例可以保存的类型（可以有多个）。
> - 通过使用泛型就可以在编译期防止将错误类型的对象放置在容器中。
#### 2) 保存对象
> - Collection 一个独立元素的序列，这些元素都服从一条或者多条规则
>> - List 按照插入的顺序保存元素
>> - Set 不能有重复的元素
>> - Queue 按照排队规则来确定对象产生的顺序（通常与它们被插入的顺序相同）
> - Map 一组成对的“键值对”对象，允许使用键来查找值。这种关联关系称为“字典”
#### 3) 添加一组元素
> - 普通的增加元素只需要collection.add()即可
> - map的话用put()方法
> - 所有的Collectons类型都包含该方法：addAll()，接受一个Collection对象，以及一个数组或者是一个用逗号分隔的列表，将元素添加到Collections中。该方法只接受另一个Collection对象作为参数
                
                Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
                //实例的方法 因为不包含对象作为参数，所以运行起来比对象的方法要快
                collection.addAll(Arrays.asList({6, 7, 8, 9})); 
                Collections.addAll(collection, 11, 12, 13, 14, 15); // 对象的方法
> - Arrays.asList()方法接受一个数组或是一个用逗号分隔的元素列表（使用可变参数），并转换为一个List对象。
                
                List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
#### 4) List
> - List承诺可以将元素维护在特定的序列中。List接口在Collection的基础上添加了大量的方法，使得可以在List的中间插入和移除元素
> - 两种基本类型的List
>> - ArrayList，擅长于随机访问元素，但是在List中间插入和移除元素时比较慢
>> - LinkedList，它通过代价较低的在List中间进行的插入和删除操作，提供了优化的顺序访问。但是在随机访问方面相对比较慢
#### 5) 迭代器
> - 迭代器是一个对象，也是一种设计模式。它的工作是遍历并选择序列中的对象。而客户端程序员不必要知道该序列底层的结构。
> - Java的Iterator只能单向移动
> - 迭代器其实也是一个容器，也需要在后面添加泛型
                
                Iterator<Pet> it = pets.iterator
> - 可以说，迭代器统一了对容器的访问方式
> - 方法
>> - 使用方法iterator()要求容器返回一个Iterator，Iterator将准备好返回序列的第一个元素。
>> - 使用next()获得序列中的下一个元素
>> - 使用hasNext()检查序列中是否还有元素
>> - 使用remove()将迭代器新近返回的元素删除
> - ListIterator是一个更加强大的Iterator的子类型
>> - 除了可以向前移动，还可以双向移动。
>> - 还可以产生相对于迭代器在列表中指向当前位置的前一个和后一个的索引
>> - 并且可以使用set()方法替换它访问过的最后一个元素
>> - 可以通过调用listIterator()要求容器返回一个指向List开始处的ListIterator
>> - 也可以通过调用listIterator(n)要求容器返回一个指向List列表索引为n的ListIterator
>> - 但是只能用于各种List类的访问。
>>>>>> ![图7-7 iterator迭代器](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-7%20iterator%E8%BF%AD%E4%BB%A3%E5%99%A8.png?raw=true)
#### 6) LinkedList
> - LinkedList也像ArrayList那样基本实现了List接口
> - 在执行某些操作（在List的中间插入和移除）时比ArrayList更高效
> - 能够实现栈的所有功能的方法
> - 基本方法
>> - removeFirst()
>> - removeLast()
>> - getFirst()
>> - addFirst()
>> - addLast()
>> - peek() // 移除并返回第一个元素
>> - pop() // 移除第一个元素并返回列表的头
>> - poll()
#### 7) Stack
> - 先进后出，用LinkedList来实现
> - 因为LinkedList能够实现栈的所有功能的方法
> - > - 其实是存在java.util.Stack这个公共类，但是因为使用LinkedList可以产生更好的Stack，因此一般都是自己创建
>>>>>> ![图7-8 使用LinkedList实现stack](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-8%20%E4%BD%BF%E7%94%A8LinkedList%E5%AE%9E%E7%8E%B0stack.png?raw=true)
#### 8) Set
> - 不保存重复的元素
> - 具有与Collection完全一样的接口，因此没有额外的功能，其实Set就是Collection，只是行为不同（继承和多态的典型应用）
> - 最常被使用的是测试归属性，也就是说容易询问某个对象是否在某个Set中
> - 实现这个接口的常用类有HashSet,TreeSet或者是LinkedHashSet
> - 排列的顺序没有任何规律可循，这是因为处于速度的考虑，而且不同大的实现类的元素存储方式不同
>> - HashSet使用了散列函数
>> - TreeSet使用了红黑树，保持元素的排序状态
>> - LinkedHashList也是使用了散列，但是 看起来像是使用了链表来维护元素的插入顺序。
> - 一般使用contains()测试Set的归属性
#### 9) Map
> - Map<Person, List<Pet>>
> - 实现类: HashMap, treeMap
> - HashMap用于快速访问，treeMap
> - containsKey()和containsValue()来测试Map
> - treeMap
> - put()
> - get()
>>>>>> ![图7-9 map的使用](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE7-9%20map%E7%9A%84%E4%BD%BF%E7%94%A8.png?raw=true)
#### 10) Queue
> - 队列
> - offer()方法在允许的情况下，将一个元素插入队尾，或者返回false。
> - peek()和element()都将在不溢出的情况下返回队头，当队列为空的时候，peek()返回null，但是element()则抛出NoSuchElementException异常
> - poll()和remove()方法将一处并返回队头，当队列为空的时候， poll()返回null，但是remove()则抛出NoSuchElementException异常
> - LinkedList提供了方法支持队列的行为，并且它实现了Queue接口
> - PriorityQueue优先级队列，声明下一个弹出的元素是最需要的元素
#### 11) Foreach
> - 主要用于数组，但是也可以用于Collection对象
                
                for(String s: cs) {
                    // doSomething
                }
        
------      
        
<h2 id='10'>十、反射</h2>
<h3 id='10.1'>10.1 介绍</h3>  
        
#### 1) 特点
> - 在编译时不必已知某个对象的确切类型，便能在运行时获取类的信息
> - java.lang.reflect类库，包含了
>> - Field类　用get()和set()方法读取和修改Field关联的字段
>> - Method类 用invoke()方法调用与Method对象关联的方法
>> - Constructor类
> - 以上三个类都实现了Member接口，这些类型都是在JVM在运行时创建
#### 2) 与RTTI的区别
> - 对RTTI来说，编译器在编译时打开和检查.class文件，而对于反射机制而言，.class文件在编译的时候不可获取，所以只能在运行时打开和检查.class文件
#### 3) 类方法提取器
> - Class方法的getMethods()和getConstructors()方法分别返回Method对象的数组和Constructor独对象的数组
> - 主要用于查找类的方法不看JDK文档（大雾？）
                
                /**
                 * 
                 */
                package com.sjtu.javaStudy;
                import java.io.BufferedReader;
                import java.io.StringReader;
                import java.util.Scanner;
                import java.util.regex.Matcher;
                import java.util.regex.Pattern;

                import java.lang.reflect.*;

                /**
                 * @author hblvs
                 *
                 */
                public class JavaTest {
                    
                    publc static BufferedReader buffer(String str) {
                        BufferedReader bf = new BufferedReader(new StringReader(str));
                        return bf;
                    }


                    /**
                     * @param args
                     */
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                             @SuppressWarnings("rawtypes")
                             Class javatest = Class.forName("com.sjtu.javaStudy.JavaTest");
                             Method[] method = javatest.getMethods();
                             for(Method m1 : method) {
                                 System.out.println(m1);
                             }
                             @SuppressWarnings("rawtypes")
                             Constructor[] constructor = javatest.getConstructors();
                             for(@SuppressWarnings("rawtypes") Constructor c1 : constructor) {
                                 System.out.println(c1);
                             }
                         } catch (ClassNotFoundException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                         } catch (SecurityException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
                
                // Output
                public static void com.sjtu.javaStudy.JavaTest.main(java.lang.String[])
                public static java.io.BufferedReader com.sjtu.javaStudy.JavaTest.buffer(java.lang.String)
                public final void java.lang.Object.wait() throws java.lang.InterruptedException
                public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
                public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
                public boolean java.lang.Object.equals(java.lang.Object)
                public java.lang.String java.lang.Object.toString()
                public native int java.lang.Object.hashCode()
                public final native java.lang.Class java.lang.Object.getClass()
                public final native void java.lang.Object.notify()
                public final native void java.lang.Object.notifyAll()
                public com.sjtu.javaStudy.JavaTest()

#### 4) Java反射技术栈
> - [Java反射技术栈](https://github.com/hblvsjtu/Java_Study/blob/master/Java%E5%8F%8D%E5%B0%84%E6%8A%80%E6%9C%AF%E6%A0%88.pdf)
                

        
------      
        
<h2 id='11'>十一、部署Java应用程序</h2>
<h3 id='11.1'>11.1 介绍</h3>  
        
#### 1) 
> - 
                
<h3 id='11.2'>11.2 网络</h3>  
        
#### 1) 
> - 
                
<h3 id='11.3'>11.3 脚本、编译与注解处理</h3>  
        
#### 1) 
> - 
                
<h3 id='11.4'>11.4 安全</h3>  
        
#### 1) 
> -  
        
        
------          
        
<h2 id='12'>十二、类型信息与注解、字符串</h2>
<h3 id='12.1'>12.1 类型信息</h3>  
        
#### 1) 概念
> - 运行时的类型信息使得你可以在程序运行时发现和使用类型信息
> - Java是如何让我们在运行时识别对象和类的信息：
>> - 传统的RTTI 运行时类型识别(RTTI, Run-Time Type Identification), 假定我们在编译的时就已经知道所有的类型
>> - 反射机制 允许在运行时发现和使用类的信息
#### 2) 为什么需要RTTI
> - 多态与类型转换
> - 代表对象类型的Class对象
> - 关键字instanceof 动态测试对象的途径 与isInstance()完全一样，但是这两个东西跟==或者equal()不同，后面两个不能测试超类，只能测试当前类，不考虑继承
                
                if(x instanceof Dog) {
                    ((Dog)x).bark();
                }

        
<h3 id='12.2'>12.2 Class对象</h3>  
        
#### 1) 概念
> - 每一个类都有一个Class对象，表示的是该类的确切类型
> - 每当编写并且编译一个新类，就会产生一个Class对象，更恰当的说，是被保存在一个同名的.class文件中
> - 它包含了与类有关的信息，Java需要使用Class对象来执行其RTTI
> - JVM使用“类加载器”的子系统来运行这个类
> - 类是被动态的按需加载到JVM中，什么叫按需加载呢？就是第一次使用的时候，比如创建第一个对类的静态成员的引用，或者使用new创建对象（这也证明了构造器也是类的静态方法）
> - 类被加载的时候，将会被接受验证，以确保没有被破坏，并且不包含不良的Java代码
#### 2) 取得Class对象引用的方法
> - Class.forName
                
                /* 取得Class对象引用的一种方法
                 * 同时如果该类没有被加载的话或被类加载器加载
                 * 如果找不到你要加载的类，他可能会抛出异常ClassNotFoundException
                 */
                Class.forName(“ClassYouWant”); 
> - 类字面量 这样做不仅简单，而且更加安全没因为它在编译时就会收到检查，因此不需要置于try语句中。不仅可以应用于普通的类，也可以应用于接口，数组以及基本数据类型。不过有趣的是，使用“.class”的方法来创建对Class对象的引用时，并不会自动的初始化该Class对象
                
                FancyToy.class
>>>>>> ![图12-1 字面量与包装类的类型引用](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE11-4%20%E5%B8%B8%E7%94%A8%E7%9A%84%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8Fflag2.png?raw=true)
> - 只要你想在运行时使用类型信息，就必须先要获得对恰当的Class对象的引用， Class.forName便提供了便利
                
                /**
                 * 
                 */
                package com.sjtu.javaStudy;

                /**
                 * @author hblvs
                 *
                 */
                public class JavaTest {
                    
                    /**
                     * @param args
                     */
                    public static void main(String[] args) {
                        // TODO Auto-generated method stub
                         
                         int[] myArray = {1, 2, 3, 4};
                         try {
                            @SuppressWarnings("rawtypes")
                            // 类名必须要加上包名
                             Class c = Class.forName("com.sjtu.javaStudy.LocalClass");
                             System.out.println("after Class.forName");
                             System.out.println(c);
                             System.out.println(myArray.getClass());
                             Class intClass = int.class;
                             System.out.println("after int.class");
                             Class integerTYPE = Integer.TYPE;
                             System.out.println("after Integer.TYPE");
                             System.out.println(intClass);
                             System.out.println(integerTYPE);
                         } catch (ClassNotFoundException e) {
                             // TODO Auto-generated catch block
                             e.printStackTrace();
                         }
                    }
                }

                class LocalClass {
                    static {
                        System.out.println("I am LocalClass");
                    }
                 };
                
                // output
                I am LocalClass
                after Class.forName
                class com.sjtu.javaStudy.LocalClass
                class [I
                after int.class
                after Integer.TYPE
                int
                int
#### 3) 使用类而做的准备
> - 加载 由类加载器执行，查找字节码并创建Class对象
> - 链接 验证类中的字节码，为静态域分配空间
> - 初始化 初始化被延迟到对静态方法（构造器隐式的是静态的）或者是非常熟静态域进行首次引用时才执行
#### 4) 泛化的Class对象 
> - Class<?>即便与Class等价，但由于Class，因为它表示并非碰巧或者由于疏忽而使用了一个非具体的类引用，而是用来非具体的版本。添加泛型仅仅是为了提供编译期的类型检查。因为即便你操作有误，也能立即发现
                
                // 
                Class<?> intClass = int.class 
#### 5) 新的转型语法
> - cast()
                
                House.class.cast(otherClass);1

       
<h3 id='12.3'>12.3 空对象</h3>  
        
#### 1) 特点
> - 可以接受传递给他的所以代表的对象的消息，但是实际返回表示为实际上并不存在任何真实对象的值
> - 可以想象为空，但以后会赋值
    
<h3 id='12.4'>12.4 注解</h3>  
        
#### 1) 介绍
> - 也叫做元数据，为代码添加信息提供一种形式化的方法，一遍在以后可以方便地使用
#### 2) javadoc
> - 自由格式文本的第一句应该是一个概括性的句子，javadoc会自动把他抽取作为概要页
> - 可以由源文件生成一个HTML文件，以/\*\*开始，\*/后面跟着是自由格式文本，可以使用HTML修饰符。
                
                如用于强调的<em></em>
                用于着重强调的<strong></strong>
                包含图像的<img>等
                如果要键入等宽字体，则可以使用{@code...}
> - 可以从以下几个特征中抽取信息
>> - 包
>> - 公有类与接口
>> - 公有的和受保护的狗在其及方法
>> - 共有的和受保护的域
#### 3) 类注释
> - 类注释必须放在import语句之后，类定义之前
#### 4) 方法注释
> - 

                
                package practice;

                import java.io.PrintWriter;
                import java.nio.file.Paths;
                import java.util.Scanner;

                /**
                 * Description:
                 * <br>网站: <a href="https://github.com/hblvsjtu/Java_Study">Java_Study</a>
                 * <br>Copyright (C), 2017-2019, Lv Hongbin
                 * <br>This program is protected by copyright laws.
                 * <br>Program Name: HelloWorld
                 * <br>Date: 2019-03-30
                 * @author Lv Hongbin hblvsjtu@163.com
                 * @version 1.0
                 */

                public class HelloWorld {

                    static String s1 = "你好";
                    enum Size {SAMLL, MEDIUM, LARGE, EXTRA_LARGE};
                    /**
                     * Main 方法
                     * @param args
                     * @return none
                     */
                    public static void main(String[] args) {

                    }

                    Description: 
                    网站: Java_Study 
                    Copyright (C), 2017-2019, Lv Hongbin 
                    This program is protected by copyright laws. 
                    Program Name: HelloWorld 
                    Date: 2019-03-30
                    Version:
                            1.0
                    Author:
                            Lv Hongbin hblvsjtu@163.com

                    Main 方法
                    Parameters:args
                    Returns:none


> - 使用@符号
> - Java SE5内置了三种方法
>> - @Override 覆写超类的方法
>> - @Deprecated 如果使用了该类注释的方法编译器会发出警告
>> - SuppressWarings 关闭不当额编译器警告信息
> - 此外，还有四种注解的方法
#### 2) 基本语法
> -  注解的使用方法几乎与修饰符的使用一模一样
                
                @Test void testExecute() {
                    // doSomething
                }
#### 2) 注解的定义 
> - 与接口类似，注解也会编译成class文件
> - 定义元注解的时候，会需要一些元注解（meta-annotation）如@Target和@Retention
> - @Target用于定义注解将应用于什么地方，是一个方法还是一个域
> - @Retention定义该注释在哪一个级别可用，在源代码中（SOURCE），类文件（CLASS）或者是运行时（RUNTIME）
                
                import java.lang.annotation.*;

                @Target(ElementType.Method);
                @Retention(RetentionPolicy.RUNTIME);
                public @interface useCase {
                    // doSomething
                }
>>>>>> ![图12-2 元注解.png](https://github.com/hblvsjtu/Java_Study/blob/master/picture/%E5%9B%BE12-2%20%E5%85%83%E6%B3%A8%E8%A7%A3.png?raw=true)
> - 而没有元素的注解称为**标记注解**

        
        
------      
        
<h2 id='12'>十三、并发</h2>
<h3 id='13.1'>13.1 留在写《Java多线程编程核心技术》时候再补充</h3>  
        
#### 1) 概念
> - 

        
        
------      
        
<h2 id='14'>十四、JVM</h2>
<h3 id='14.1'>14.1 留在写《深入理解Java虚拟机》时候再补充</h3>  
        
#### 1) 概念
> - 
        
        
------      
        
<h2 id='15'>十五、输入和输出</h2>
<h3 id='15.1'>15.1 Java SE8 的流库</h3>  
        
#### 1) 原则
> - “做什么而非怎么做”
#### 2) 特点
> - 流不存储元素。这些元素可能存储在底层的集合中，也可能是按需生成
> - 流的操作不会修改数据源，而是会生成一个新的流
> - 流的操作是尽可能的惰性执行的，也就说在程序运行中需要数据的时候才会执行流
                
                /**
                 * 
                 */
                package tool;

                import java.util.Arrays;
                import java.util.List;

                /**
                 * @author LvHongbin
                 *
                 */
                public class MyStream extends IOFile{

                    /**
                     * 
                     */

                    private int count;
                    private List<String> strList;
                    public MyStream() {
                        super();
                        this.count = 0;
                        this.strList = Arrays.asList(super.getName().split("/"));
                    }
                    
                    public MyStream(String name, String splitChar) {
                        super(name);
                        this.count = 0;
                        this.strList = Arrays.asList(super.getName().split(splitChar));
                    }
                    
                    public void countNumber(int num) {
                        for(String str: this.strList) {
                            if(str.length() > num) {
                                System.out.println(str);
                                this.count ++;
                            }
                        }
                        System.out.println("this.count = " + this.strList.stream().filter(w -> w.length() > num).count());
                    }
                }

                MyStream myStream = new MyStream("lvhongbin/lvhongbin1/lvhongbin12/lvhongbin123/lvhongbin1234/lvhongbin12345", "/");
                myStream.countNumber(10);

                lvhongbin12
                lvhongbin123
                lvhongbin1234
                lvhongbin12345
                this.count = 4

#### 3) 流的创建
> - 使用Collection接口的stream方法
> - 如果你有一个数组，也可以使用静态方法Stream.of方法，参数是数组，返回Stream类
                
                Stream<String> words = Stream.of(contents.split("/"))
> - 使用Array.stream(array, from, to)把数组从第from个元素到第to个元素创建一个流
#### 4) filter和map方法
> - filter用于过滤，采用函数式编程，函数中的参数就是流中每个元素
                
                this.strList.stream().filter(w -> w.length() > num).count());

> - map用于流中的元素进行转换，同样采用函数式编程，函数中的参数就是流中每个元素
                
                this.strList.stream().map(w -> w.subString(0,1)); //取每个元素的首字母
#### 5) 抽取子流和连接流
> - Stream.limit(n) 抽取前面n个元素后结束
> - Stream.skip(n) 忽略前面n个元素后结束
> - Stream.concat(Stream A, Stream B) 连接A元素和B元素
#### 6) 其他流转换
> - Stream.distinct() 包含一个流，里面没有重复的元素
> - Stream.sorted() 排序
#### 7) 简单约简Optional<T>类
> - 从数据中获取最终答案，是一种终结操作，称为“约简”
> - Optional<T>类对象是一种包装器类型，但是它只有两种结果，要么包含了类型T的对象，要么没有包含任何对象。其实也就是在该对象没有赋值的情况下给它默认一个值。
#### 8) 基本类型流
> - IntStream、LongStream和DoubleStream
                
<h3 id='15.2'>15.2 输入和输出</h3>  
        
#### 1) 基础
> - 抽象类InputStream，有一个抽象方法
                
                // 读入一个字节，并返回读入的字节，如果遇到源结尾则返回-1
                abstract int read()
> - 抽象类OutputStream，有一个抽象方法
                
                // 向某个输出位置写出一个字节
                abstract void write(int b)  
> - read和write方法在执行时都会阻塞流，直至字节确实被读入或者写出，即当前线程被阻塞
> - 完成流的输入和输出的时候，需要调用close()方法关闭它。再关闭到时候也会冲刷用于该输出流的缓冲区。如果不关闭则有可能最后一个包将永远得不到传递。当然我们还可以使用flush方法人为冲刷。
#### 2) 字节级别的输入输出
> - FileInputStream & FileOutputStream & PushbackInputStream & DataInputStream
> - 字节级别的读写
> - 可以进行组合，比较灵活
                
                public void inputFile() throws IOException{
                        PushbackInputStream pin = new PushbackInputStream(  // 可回推用于预览
                                new BufferedInputStream(
                                        new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt")
                                )
                        );
                        int b = pin.read(); //读取Unicode码元0~65535之间的整数，每次读一个，每次读一个
                        if(b == '%') {
                            pin.unread(b);  //回退
                            System.out.println("123.txt: " + "//回退");
                        }
                        DataInputStream din = new DataInputStream(pin); //可以把读到的字节进行组装到更有用的数据类型中
                        System.out.println("123.txt: " + din.read() + " " + din.readInt());    //读取Unicode码元0~65535之间的整数，每次读一个
                        din.close();
                    }

                    IOFile io = new IOFile();
                    io.inputFile();

                    123.txt: //回退
                    123.txt: 49 842216501 

> - ZIP压缩文件
                    
                    ZipInputStream zin = new ZipInputStream(new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.zip"));
                     DataInputStream din = new DataInputStream(zin);

#### 3) 文件的输入InputStreamReader & 输出OutputStreamWriter
> - 可以选择编码格式
> - 输出更习惯使用PrintWriter
> - 输入更习惯使用Scanner
> - 详细请看 [2.6 输入与输出](#2.6)
#### 4) 读写二进制数据
> - 文本格式的读写在阅读和调试方面比较方便，但是二进制格式的读写会更加的高效
> - DataInput 和 DataOutput
#### 5) 对象的输入/输出流与序列化
> - 主要是用来保存对象的数据
> - 首先要获得一个ObjectInputStream或者是ObjectOutputStream对象
> - “对象序列化”，可以将任何对象写到输出流中，并将其读回。其中有一定需要注意的是该类必须要实现Serializable接口，虽然这个接口没有任何方法，否则会出错。
> - 可以利用这个方法进行深拷贝（比如利用System.out或者ByteArrayOutputStream作为临时存储）
> - 序列化的算法
>> - 对你遇到的每一个对象引用都关联一个序列号
>> - 对于每个对象，当第一次遇到的时候，保存其对象数据到输出流中
>> - 如果某个对象之前已经被保存过，那么只写出“与之前保存过的序列号为x的对象相同”
>> - 在读回的时候，整个过程是相反的
> - [图15-1 一个对象序列化的实例.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E7%BB%8F%E9%AA%8C.pdf)
        

                
                /**
                 * 
                 */
                package tool;

                import java.io.BufferedInputStream;
                import java.io.DataInputStream;
                import java.io.FileInputStream;
                import java.io.FileOutputStream;
                import java.io.IOException;
                import java.io.ObjectInputStream;
                import java.io.ObjectOutputStream;
                import java.io.PrintWriter;
                import java.io.PushbackInputStream;
                import java.io.Serializable;
                import java.math.BigInteger;
                import java.nio.file.Paths;
                import java.util.Scanner;

                /**
                 * @author LvHongbin
                 *
                 */
                public class IOFile implements Serializable{
                    
                    private String name;
                    
                    public IOFile() {
                        this.name = "Lv Hongbin";
                    }
                    
                    public IOFile(String name) {
                        this.name = name;
                    }
                    
                    public String getName() {
                        return this.name;
                    }
                    
                    public void modifyName(String name) {
                        this.name = name;
                    }
                    
                    public void scan() throws IOException{
                        Scanner in = new Scanner(System.in);
                        System.out.println("Please input your name：");
                        String name = in.nextLine();
                        String sex = in.next();
                        int age = in.nextInt();
                        System.out.println("\n" + name + "先生,\n性别：" + sex + ",\n年龄："+ age + ";\n密码："+ "。");
                        in.close();
                    }
                    
                    public void writeFile() throws IOException{
                        BigInteger[] big = {BigInteger.valueOf(1234567890L),BigInteger.valueOf(9876543210L)};
                        PrintWriter pw = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\PrintWriter.txt", "UTF-8");
                        pw.print("authod: " + this.name + "\r\n" + big[0].add(big[1]));
                        pw.close();
                    }
                    
                    public void readFile() throws IOException{
                        @SuppressWarnings("resource")
                        Scanner file = new Scanner(Paths.get("C:\\Users\\Lv Hongbin\\Desktop\\StartWeChat.bat"), "UTF-8");
                        System.out.println("StartWeChat.bat: " + file.nextLine());
                    }
                    
                    public void inputFile() throws IOException{
                        PushbackInputStream pin = new PushbackInputStream(  // 可回推用于预览
                                new BufferedInputStream(
                                        new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt")
                                )
                        );
                        int b = pin.read();
                        if(b == '1') {
                            pin.unread(b);  //回退
                            System.out.println("123.txt: " + "//回退");
                        }
                        DataInputStream din = new DataInputStream(pin);
                        System.out.println("123.txt: " + din.read() + " " + din.readInt());
                        din.close();
                    }
                    
                    public void outputObject(Object obj) throws IOException{
                        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt"));
                        output.writeObject(obj);
                        output.flush();
                        output.close();
                    }
                    
                    public void intputObject() throws IOException{
                        ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt"));
                        try {
                            IOFile str = (IOFile) input.readObject();
                            System.out.println(str.name);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        input.close();
                    }
                }


                IOFile io = new IOFile();
                io.outputObject(new IOFile("xiaoJuan"));
                io.intputObject();

                xiaoJuan

                file:  sr tool.IOFile痷毘u L namet Ljava/lang/String;xpt xiaoJuan

                
<h3 id='15.3'>15.3 操作文件</h3>  
        
#### 1) Path
> - 目录类
                
                Path p = Paths.get("目录名");
                Path p = Paths.get("目录名分割1", "目录名分割2", "目录名分割3"...);    // 虚拟机会根据不同的系统用“/”或者“\”连接起来

#### 2) 基本文件操作
> - 读取文件
                
                // 方法一，使用Scanner类，但是要逐行读入
                
                // 方法二，当字符串读入所有内容
                byte[] bytes = Files.readAllBytes(path);
                String content = new String(bytes, charset);

                // 方法三，把文件当作行序列读入
                List<String> line = Files.readAllLine(path);

> - 写入文件
                
                // 方法一，使用PrintWriter

                // 方法二，写入一个字符串
                Files.write(path, content.getBytes(charset));

                // 方法三，写入一行
                Files.write(Path, lines);

> - 大文件需要以来输入和输出流，或者读写器
                
                InputStream in = Files.newInputStream(path);
                OutputStream Out = Files.newOutputStream(path);

                Reader in = Files.newBufferedReader(path, charset);
                Writer Out = Files.newBufferedWriter(path, charset);

> - 内存映射文件FileChannel类 利用虚拟内存实现将一个文件或者文件的一部分“映射”到内存中，然后这个文件就可以当作是内存数组一样地访问，比传统的文件操作要快很多。
> - [图15-2 文件操作的处理时间数据.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E7%BB%8F%E9%AA%8C.pdf)
        
> - 创建文件 Files.createDirectory(path)
> - 复制文件 Files.copy(fromPath, toPath, StandardOpenOption.XXX) Files.copy(inputStream, toPath, StandardOpenOption.XXX) Files.copy(fromPath, outputStream, StandardOpenOption.XXX)
> - 移动文件 Files.move(fromPath, toPath, StandardOpenOption.XXX)
> - 删除文件 Files.delete(Path) 但是为了避免文件不存在而抛出异常，可以使用Files.deleteIfExist(Path)
> - 其他方法 Files.exists(Path)，Files.isHidden(Path)，Files.isReadable(Path)，Files.isWritable(Path)，Files.isExecutable(Path)，Files.size(Path)
#### 3) 缓冲区数据结构
> - 当耗尽所有数据或者写出的数据量达到容量大小的时候，就该切换读入的操作
> - 通过调用flip的方法将界限设置到当前位置，并把读写位置复位到0，
> - [图15-3 缓冲区数据结构.jpg](https://github.com/hblvsjtu/Java_Study/blob/master/java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E7%BB%8F%E9%AA%8C.pdf)
#### 4) 文件锁
> - 需要用到FileChannel类
                
                FileChannel fc = FileChannel.open(path);
                FileLock lock = channel.lock();
                //或者
                FileLock lock = channel.tryLock();

                //释放
                lock.release();
------      
        
<h2 id='16'>十六、数据库编程</h2>
<h3 id='16.1'>16.1 介绍</h3>  
        
#### 1) 概念
> - [java项目实战经验](https://github.com/hblvsjtu/Java_Study/blob/master/java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E7%BB%8F%E9%AA%8C.pdf)
        
        
------      
        
<h2 id='17'>十七、项目经验</h2>
<h3 id='17.1'>17.1 经验</h3>  
        
#### 1) 概念
> - [java项目实战经验](https://github.com/hblvsjtu/Java_Study/blob/master/java%E9%A1%B9%E7%9B%AE%E5%AE%9E%E6%88%98%E7%BB%8F%E9%AA%8C.pdf)
