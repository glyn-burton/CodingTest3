package com.example.codingtest3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var testArray = intArrayOf(1, 2, 3, 4, 5, 6, 10, 20, 50)
    var target = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG", "Hello")
        //binarySearch(testArray,target) --> For some reason it freezes up the system, unsure
        //algorithm should be accurate.

    }

    fun binarySearch(intArr:IntArray, intTarget:Int) : Int
    {
        var min:Int = intArr[0]
        var max:Int = intArr.size - 1

        while(min <= max){

            var mid = min + (max-1) / 2

            if (intTarget == intArr[mid]){

                return intArr[mid]
            }
            if (intTarget > intArr[mid]){


                min = mid +1

            }
            if (intTarget < intArr[mid])

                max = mid -1


        }
        return -1



    }

    fun manualPowerFunc(powNum: Int, powerBy:Int):Int{
        var powerTracker = 0
        var currValue = 0

        if (powerBy < 0){

            while (powerTracker < powerBy){
                var base = 0
                if (powerTracker == 0){

                    base = powNum/powNum
                    powerTracker ++
                    currValue + base

                }
                else{

                    currValue /= powNum
                    powerTracker ++

                }
                return currValue


            }
            return currValue


        }
        else{
            while (powerTracker < powerBy){
                var base = 0
                if (powerTracker == 0){

                    base = powNum*powNum
                    powerTracker ++
                    currValue + base

                }
                else{

                    currValue *= powNum
                    powerTracker ++

                }
                return currValue


            }
            return currValue

        }







    }



}
