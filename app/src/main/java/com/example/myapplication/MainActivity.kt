package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.button)
            button1.setOnClickListener{
                val text = editText.text.toString()
                when(text) {
                    "help" ->{Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                    AlertDialog.Builder(this).apply {
                        setTitle("帮助")
                        setMessage("感谢您的使用，本软件记录了部分工作室的人员档案，以及一些编程语言的词条，可供大家使用  如有什么可以改进的地方，" +
                                "可Email me at2919870840@qq.com，感谢！！  by 吃瓜队长  可搜索人员： office工作室整体  等（直接搜索即可）  可搜" +
                                "索编程语言（拉丁字母均小写） \np.s.哦对，在这个软件之中，会有很多的小彩蛋哦！！   " +
                                "\n注：如想了解封面信息，请进行回复“封面”(点击返回返回即可)")
                        show() }
                    }
                    "吃瓜队长" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("吃瓜队长")
                            setMessage("一个玉树临风，风流潇洒的人，平常写写书，喝喝茶，享受养老人生……工作室室长，琴棋书画样样精通，常与言语一起脱稿，会" +
                                    "Python和各种计算机软件，属于理工男吧……再一次普通的体育课上，和陈小样一起聊天之时，突发灵感，便于陈小样一起做出了《" +
                                    "选择的大冒险》这一巅峰之作！！这就是工作室第一个正式的代表作。工作室中的领头羊，引领了工作室度过了一个又一个春秋……(点" +
                                    "击返回返回即可)")
                            show()
                        }
                    }
                    "office工作室整体" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("office工作室整体")
                            setMessage("一个连基地也没有的伪工作室，建立于2016年初，本是一个做盗版游戏的工作室，最初盗版代表作有：《逗比危机》（因后期二次" +
                                    "被盗版，宣布关闭服务器，对方因管理不善，一周后倒闭……）《超级马里奥制造》（因后期无新关卡，默默淡出人们视线）,后来，在" +
                                    "偶然的 一次发现，我们有了自己的第一个原创游戏！！《选择的大冒险》（本地版游戏），引来了无数人们前来游玩，因此我们又有" +
                                    "了更多的新成员，这时，工作室改名，改为“caly250andcxy249/fjy100”工作室，简称“office工作室”，经过漫长的岁月，我们" +
                                    "现在已有微信 公众号（吃瓜队长 caly250andcxy249）网站（officeteam.mycool.net）官方日记类漫画《工作室里的那点事" +
                                    "》（在网易漫画上），希望工作室能越走越远，再创辉煌！！(点击返回返回即可)")
                            show()
                        }
                    }
                    "陈小样" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("陈小样")
                            setMessage("一个十分嘚瑟的人，室长的好朋友，点子多，富有活力，却因嘚瑟常常受到其他人的排挤……工作室的元 老之一，曾参加《选择的大冒" +
                                    "险》多次的制作工作，也算是勤勤恳恳。遇事喜欢多向他人请教，有多种绰号例如“陈嘚瑟”（太爱嘚瑟而起的绰号）“糖葫芦陈”（作业" +
                                    "上错误太多，如糖葫芦一样可以一个一个 穿起来，因此绰号）“奶茶帅哥”（喝奶茶是问别人自己帅不帅，因此而得）等，可见多受人民" +
                                    "爱戴……(点击返回返回即可)")
                            show()
                        }
                    }
                    "皮皮虾" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("皮皮虾")
                            setMessage("这是工作室里少有的女生（有些人并不认为）。工作室的元老之一，在有《选择的大冒险》之时，因表现 积极，被录取，曾设" +
                                    "计过很少几关（好像没设计过【捂脸哭】），曾担任过office电视台（很久以前的一 个小分支）的主播，后因室长业务繁忙，电视" +
                                    "台取消，便又没有了事情……（另提一句，是位学霸【瑟瑟 发抖】）(点击返回返回即可)")
                            show()
                        }
                    }
                    "言雨" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("言雨")
                            setMessage("勤勤恳恳工作，时不时偷懒，漫画部主力担当！在漫画中，因陈小样秃头，而与其有过节。其实在现实中 ，关系还是很好的" +
                                    "……最初之时，是游戏《选择的大冒险》的粉丝与其中的几集的策划者，最初的代号为 “熊猫”。过了很久之后，工作室的另一代表" +
                                    "作《工作室里的那点事》要做出了网络线上板时，成功的脱 颖而出，成为了改版后的编剧，至于这个“言雨”的名字是咋来的，是他" +
                                    "十分勇敢的找语文老师起的……(点击返回返回即可)")
                            show()
                        }
                    }
                    "茗月" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("茗月")
                            setMessage("这也是工作室中少有的女生（女生只有4个……），工作室作品的粉丝，因表现积极，被录取，用于用户体验改造的提议工作。是" +
                                    "工作室里的元老之一。曾在office电视台做主播（后因室长业务繁忙，电视台取消 ……）(点击返回返回即可)")
                            show()
                        }
                    }
                    "白蕊" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("白蕊")
                            setMessage("小豌豌的官配。(点击返回返回即可)")
                            show()
                        }
                    }
                    "小闪" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("小闪")
                            setMessage("工作室成员，加入过程曲折，是由白蕊介绍来的，与白蕊是大学时的好同学，在工作室之中和茗月一起担任" +
                                    "前端编辑、设计工作，常常自称为“吴彦祖”（表示为自己是最帅的 p.s.真会嘚瑟……），因此也得名“阿祖”，喜欢有小样等人一起打" +
                                    "cs：go，【1】拥有特异功能，可进行稳定电压的交流电和直流电的出书，因此多被当作可以随时给手机充电的移动工具人" +
                                    "(点击返回返回即可)")
                            show()
                        }
                    }
                    "小a" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("小a")
                            setMessage("工作室成员，全名：\n“小·@136.com@126.com·a”，有意思的是小a是由小豌豌亲手制造出来的机器人，拥有感情，可以做任何事情" +
                                    "，但是因为其的智能，因此常常死机，在工作室之中进行跑腿的工作。(点击返回返回即可)")
                            show()
                        }
                    }
                    "python" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("python")
                            setMessage("Python是一种跨平台的计算机程序设计语言。是一种面向对象的动态类型语言，最初被设计用于编写自动化脚本(shel" +
                                    "l)，随着版本的不断更新和语言新功能的添加，越来越多被用于独立的、大型项目的开发。自从20世纪90年代初Python语言" +
                                    "诞生至今，它已被逐渐广泛应用于系统管理任务的处理和Web编程。Python的创始人为荷兰人吉多·范罗苏姆 [3]  （Guid" +
                                    "o van Rossum）。1989年圣诞节期间，在阿姆斯特丹，Guido为了打发圣诞节的无趣，决心开发一个新的脚本解释程序，作为AB" +
                                    "C 语言的一种继承。之所以选中Python（大蟒蛇的意思）作为该编程语言的名字，是取自英国20世纪70年代首播的电视喜剧《" +
                                    "蒙提.派森的飞行马戏团》（Monty Python's Flying Circus）(点击返回返回即可)")
                            show()
                        }
                    }
                    "c" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("c")
                            setMessage("C语言是一门面向过程、抽象化的通用程序设计语言，广泛应用于底层开发。C语言能以简易的方式编译、处理低级存储器。C" +
                                    "语言是仅产生少量的机器语言以及不需要任何运行环境支持便能运行的高效率程序设计语言。尽管C语言提供了许多低级处理的功能" +
                                    "，但仍然保持着跨平台的特性，以一个标准规格写出的C语言程序可在包括一些类似嵌入式处理器以及超级计算机等作业平台的许多计" +
                                    "算机平台上进行编译。(点击返回返回即可)")
                            show()
                        }
                    }
                    "basic" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("basic")
                            setMessage("BASIC（Beginners' All-purpose Symbolic Instruction Code，又译培基），意思就是“初学者通用符号指令代码”，是" +
                                    "一种设计给初学者使用的程序设计语言。BASIC是一种直译式的编程语言，在完成编写后不须经由编译及连结等手续即可执行，但如果" +
                                    "需要单独执行时仍然需要将其建立成执行档。(点击返回返回即可)")
                            show()
                        }
                    }
                    "java" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("Java")
                            setMessage("Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功" +
                                    "能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行" +
                                    "复杂的编程 [1]  。Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2]  。J" +
                                    "ava可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等(点击返回返回即可)")
                            show()
                        }
                    }
                    "html" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("html")
                            setMessage("HTML称为超文本标记语言，是一种标识性的语言。它包括一系列标签．通过这些标签可以将网络上的文档格式统一，使分散的Internet资源连接为一个逻辑整体。HTML文本是由HTML命令组成的描述性文本，HTML命令可以说明文字，图形、动画、声音、表格、链接等。超文本是一种组织信息的方式，它通过超级链接方法将文本中的文字、图表与其他信息媒体相关联。这些相互关联的信息媒体可能在同一文本中，也可能是其他文件，或是地理位置相距遥远的某台计算机上的文件。这种组织信息方式将分布在不同位置的信息资源用随机方式进行连接，为人们查找，检索信息提供方便。(点击返回返回即可)")
                            show()
                        }
                    }
                    "dart" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("Dart")
                            setMessage("Dart是谷歌开发的计算机编程语言，后来被Ecma (ECMA-408)认定为标准 [1]  。它被用于web、服务器、移动应用 [2]  和物联网等领域的开发。它是宽松开源许可证（修改的BSD证书）下的开源软件。\n" +
                                    "Dart是面向对象的、类定义的、单继承的语言。它的语法类似C语言，可以转译为JavaScript，支持接口(interfaces)、混入(mixins)、抽象类(abstract classes)、具体化泛型(reified generics)、可选类型(optional typing)和sound type system [3]  。(点击返回返回即可)")
                            show()
                        }
                    }
                    "kotlin" -> {
                        Toast.makeText(this, "搜索成功，正在加载", Toast.LENGTH_SHORT).show()
                        AlertDialog.Builder(this).apply {
                            setTitle("kotlin")
                            setMessage("Kotlin [1]  （科特林）是一个用于现代多平台应用的静态编程语言 [2]  ，由 JetBrains 开发。\n" +
                                    "Kotlin可以编译成Java字节码，也可以编译成JavaScript，方便在没有JVM的设备上运行。除此之外Kotlin还可以编译成二进制代码直接运行在机器上（例如嵌入式设备或 iOS）。 [2] \n" +
                                    "Kotlin已正式成为Android官方支持开发语言。本软件也是由此编写的。\n(点击返回返回即可)")
                            show()
                        }
                    }
                    "创价" ->{Toast.makeText(this, "\\parn/", Toast.LENGTH_SHORT).show()}
                    else ->{Toast.makeText(this, "你搜索了个什么东西!", Toast.LENGTH_SHORT).show()}
                }
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
