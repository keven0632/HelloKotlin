/**
 * @author KeVeN
 * @date 2017/10/23 13:57
 *
 * 集合类型 Collection
 * 同类型的值的组合，根据整体特性分：
 * 1、有序可重复-Array，索引从0开始（index，i）
 * 2、无序不重复-Set
 * 3、无序可重复-Map，但值有唯一的键（Key）
 */
fun main(args: Array<String>) {
    //Array: Array<类型> 或 arrayof（元素1,元素2,...）
//大小固定，元素类型不可变
    //地铁11号线："嘉定北","徐家汇","南翔"
    var no11Stations = arrayOf("嘉定北", "徐家汇", "南翔")
    for (no11Station in no11Stations) {
        println("各个车站名称$no11Station")
    }
    //创建一个有默认值的数组,Array(计数，{默认值})
    var no30StationsNameDefault = Array(20, { "30号线默认名称" })
    for (i in no30StationsNameDefault.indices) {
        if (i == 15) {
            println("我是第15个")
        }
    }
    //创建1到10数组：Array(10,{i->i+1})
    //i代表元素的索引值，从0开始
    //元素计数：count(),空否：isEmpty()
    //获取其中元素：数组名[索引]，首元素：数组名.first  尾元素： 数组名.last
    //获取前五个元素的快速方法  .component1到5

}