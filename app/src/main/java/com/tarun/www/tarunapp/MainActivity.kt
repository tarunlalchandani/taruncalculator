package com.tarun.www.tarunapp
import java.util.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var displaytext:String=""
    var temp:Int=0
    var p:Int=0
    var m:Int=0
    var mul:Int=0
    var d:Int=0
    var n1:Double=0.0
    var per:Int=0
    fun buselect(view:View)
    {
       var button:Button=view as Button
        when(button){
            bu1->{
                displaytext+="1"
            }
            bu2->{
                displaytext+="2"
            }
            bu3->{
                displaytext+="3"
            }
            bu4->{
                displaytext+="4"
            }
            bu5->{
                displaytext+="5"
            }
            bu6->{
                displaytext+="6"
            }
            bu7->{
                displaytext+="7"
            }
            bu8->{
                displaytext+="8"
            }
            bu9->{
                displaytext+="9"
            }
            buzero->{
                displaytext+="0"
            }
            budot->{
                temp++
                if(temp==1)
                displaytext+="."
            }
            buplus->{
                per=0
                m=0
                mul=0
                d=0
                p=0
                p++
                if(n1==0.0)
                n1=n1+displaytext.toDouble()
                displaytext=""
            }
            buminus->{
                Toast.makeText(this, "you pressed minus",Toast.LENGTH_LONG).show()
                per=0
                m=0
                mul=0
                d=0
                p=0
                m++
                if(n1==0.0)
                n1=n1+displaytext.toDouble()
                displaytext=""

            }
            bumultiply->{
                per=0
                m=0
                mul=0
                d=0
                p=0
                mul++
                if(n1==0.0)
                n1=n1+displaytext.toDouble()
                displaytext=""
            }
            budivide->{
                per=0
                m=0
                mul=0
                d=0
                p=0
                d++
                if(n1==0.0)
                n1=n1+displaytext.toDouble()
                displaytext=""
            }
            buequalto->{
                if(p==1)
                {

                    n1=n1+displaytext.toDouble()
                    displaytext=n1.toString()
                }
                else if(m==1)
                {
                    n1=n1-displaytext.toDouble()
                    displaytext=n1.toString()
                }
                else if(mul==1)
                {
                    n1=n1*displaytext.toDouble()
                    displaytext=n1.toString()
                }
                else if(d==1)
                {
                    n1=n1/displaytext.toDouble()
                    displaytext=n1.toString()
                }
                else if(per==1)
                {
                    n1=(n1*displaytext.toDouble())/100
                    displaytext=n1.toString()
                }
                p=0
                m=0
                mul=0
                d=0
                per=0
            }
            buAC->{
                displaytext=""
                n1=0.0
            }
            buplusminus->{
                if(p==0&&m==0&&mul==0&&d==0) {
                    var temp: Double = 0.0
                    temp = displaytext.toDouble() * -1
                    displaytext = temp.toString()
                    n1=displaytext.toDouble()
                }
                else
                {
                    var temp: Double = 0.0
                    temp = displaytext.toDouble() * -1
                    displaytext = temp.toString()
                }
            }
            bupercentage->{
                per++
                p=0
                m=0
                mul=0
                d=0
                if(n1==0.0)
                {
                    n1=n1+displaytext.toDouble()
                }
                displaytext=""
            }


        }
        val s=findViewById<View>(R.id.show) as TextView
        s.setText(displaytext)
    }

}
