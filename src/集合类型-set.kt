/**
 * @author KeVeN
 * @from  Mac
 * @date 2017/10/23 下午10:46
 * 集合类型 Set：无序不重复
 * 主要方法：交叉并补
 */
fun main(args: Array<String>) {
    //Set<类型>或setof（元素1，元素2...）
    //大小固定，元素类型不可变
    //地铁十一号线主线："迪士尼","徐家汇"
    //嘉定区支线："嘉定新城","嘉定西"
    //江苏昆山支线: "安亭","花桥"
    val mainLine = setOf("迪士尼", "徐家汇")
    val secondLine = setOf("嘉定新城", "嘉定西")
    val thirdLine = setOf("安亭", "花桥")

    //元素计数：count（），空否：isEmpty()
    println("总的数量：${mainLine.count()}")
    println("是否为空：${mainLine.isEmpty()}")
    //检查是否包含某个元素：contains，包含另一个Set：contaionsAll
    println("是否包含：${mainLine.contains("迪士尼")}")
    println("是否包含set--${mainLine.containsAll(secondLine)}")
    //转化为数组：toTypedArray()
    val setToArray = mainLine.toTypedArray()
    //集合之间的运算：intersect交集/subtract集合相减/union并集/minus(补集的被操作对象无需是Set类型)
    println(mainLine.union(secondLine).union(thirdLine))
    //mutableSet：MutabSet<类型>或mutabSetOf(元素1，元素2...)
    //大小可变，类型不可变
    var myMutableSet = mutableSetOf("四惠", "四惠东", "高碑店")
    var my2MutableSet = mutableSetOf("双桥", "管庄", "八里桥")
    var my3MutableSet = mutableSetOf("通州北苑", "果园", "九棵树")
    //在末尾增加元素:add方法。添加另一个集合addAll方法
    myMutableSet.add("双井")
    myMutableSet.addAll(my2MutableSet)
    //移除元素remove,移除另一个集合removeAll
    my3MutableSet.remove("通州北苑")
    my2MutableSet.removeAll(my3MutableSet)
}