/**
 * @author KeVeN
 * @date 2017/10/23 9:33
 *
 * 类型安全：变量一旦定义，其类型不可改变。
 * 即不能给变量一个类型不同的值
 */

fun main(args: Array<String>) {
    val money = 3.5

    var vip = true
    var mvp = false

    var 资金充足 = true
    资金充足 = false

    if (vip) {
        print("欢迎vip会员")
    }

    if (mvp) {

    } else {
        print("你是假的mvp")
    }
}
/**布尔型：Boolean，
 * 表示逻辑上的“真”或“假”
 * 只有2个值，true和false
 */
