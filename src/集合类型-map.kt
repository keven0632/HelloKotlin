/**
 * @author KeVeN
 * @date 2017/10/24 11:11
 *
 * 集合类型：Map：无序可重复，类似于“字典”的概念
 * 主要属性：keys（Set）,values
 * 主要方法：
 */
fun main(args: Array<String>) {
    //mapOf<key,value>(Pair(key,value),...)
    //显式指定类型，可防止初始化值类型的错误
    //机场："PVG","浦东","SHA","虹桥","HGH","萧山"
    val airports = mapOf<String, String>(Pair("PVG", "浦东"), Pair("SHA", "虹桥"), Pair("HGH", "萧山"))

    //元素计数：size，空否：isEmpty()
    println("map的计数--${airports.size}")
    println("map是否为空--${airports.isEmpty()}")
    //获取某个key对应的value：get，getOrDefault
    println(airports.getOrDefault("PVG", "中国"))

    //返回所有的key：keys，所有的value：values
    println(airports.keys)
    println(airports.values)
    //转换为可变：toMutableMap
    var myMutableMap = airports.toMutableMap()
    //mutableMapOf<key,value>(Pair(key,value),...)

    //添加或更新：下标方法 map变量名[key] = value
    myMutableMap["PVG"] = "上海市浦东新区浦东国际机场"//更新
    myMutableMap["XZ"] = "徐州国际机场"//添加
    println(myMutableMap.keys)
    println(myMutableMap.values)

    myMutableMap.put("BJ", "首都国际机场")//添加
    //移除元素：remove
    myMutableMap.remove("XZ")
    println(myMutableMap.keys)
    println(myMutableMap.values)


}
