package com.t.jicbangcopy_20201101.datas

import java.text.NumberFormat
import java.util.*

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

//            price : 25300, 175000 emd 1만보다 큰 상태
//            결과 : 2억 5300,  17억 5000  =>  ?억 + 나머지?

//            억단위는 10000으로 나누었을때 나오는 몫
            val uk = price / 10000
//            나머지는 % 연산 이용하여 구하기
            val rest = price % 10000
//            나머지 값에 콤마 처리 추가 적용
            val commaRest = NumberFormat.getNumberInstance(Locale.US).format(rest)
//             String 가공하여 uk변수 + commaRest변수 합쳐서 출력하기
            return "${uk}억 ${commaRest}"
        }
        else{
            return NumberFormat.getNumberInstance(Locale.KOREA).format(price)
        }

    }



}