class Question1 {
    var arr= arrayOf(-1,-2,-5,0,45,6,2,7,54)

    fun findMaxAndMin(arr:Array<Int>): ArrayList<Int>{
        var result= arrayListOf<Int>()
        if (arr.size<1){
            return arrayListOf()
        }
        arr.sort()
        result.add(arr.get(0))
        result.add(arr.get(arr.size-1))
        return result
    }
    fun main(){
        print(findMaxAndMin(arr))
    }
}