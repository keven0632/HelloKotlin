/**
 * @author KeVeN
 * @date 2017/10/23 11:16
 *
 * 可空类型
 * 代表变量可能没有值的情况
 * 如：用户资料的选填部分
 * 形式 ：var 变量：类型？无值则是null
 */
fun main(args: Array<String>) {
    var addr: String? = "北京市"
    var sex: Boolean? = null
    println("当前位置${addr}")
    if (sex != null) {
        println("您的性别是:${sex}")
    }

}