/**
 * @author KeVeN
 * @date 2017/10/20 15:38
 * 形式 : var 变量名： Int =3
 *由于kotlin有类型推断，类型可以省略不写
 */
fun main(args: Array<String>) {
    var runner: Int = 5
    var run = 5
    run = 6
//    print(run)
    print("每天有${runner}人跑步，每人跑步${run}公里")
}