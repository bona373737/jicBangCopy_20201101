package com.t.jicbangcopy_20201101.datas

class Room(val price:Int,
           val address:String,
           val floor:Int,
           val description:String){

//    부가기능(fun) 직접 제작
//    1) price값에 따라서 가공된 가격 알려주기 ex.3억 8,500 or
//    2) 층수값에 따라서 몇층인지 알려주기 ex. 2층, 반지하, 히나 1층

    fun getFormatedPrice():String {
//        price값이 1억 이상인지 아닌지에 따라 각각 다른 활동 로직
        if (price >= 10000){
            return "1억이상"
        }
        else{
            return "1어이 안됨"
        }

    }



}