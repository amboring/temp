class Qustion3 {
    fun fibo (arrLength:Int):ArrayList<Int>{
        var result= arrayListOf<Int>()
        var n0=0
        var n1=1
        result.add(n0)
        result.add(n1)
        for (i in 0..arrLength-3){
            var newNum=n0+n1
            result.add(newNum)
            n0=n1
            n1=newNum
        }
        return result
    }

    fun reverse(arrLength:Int):ArrayList<Int>{
        var fibo=fibo(arrLength)
        fibo.reverse()
        return fibo
    }
    fun main(){
        println(fibo(10))
        print(reverse(10))
    }
}