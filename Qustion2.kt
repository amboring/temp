class Qustion2 {
    fun palindromeNum(num:Int):Boolean{
        var str=num.toString()
        var length=str.length
        for(i in 0..Math.floor(((length / 2).toDouble())).toInt()){
            if (str.get(i)!=str.get(length-1-i)){return false}
        }
        return true
    }
    fun main(){
        print(palindromeNum(1234321))
    }
}