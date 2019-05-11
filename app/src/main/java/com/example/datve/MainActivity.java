package com.example.datve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.app.AlertDialog;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnhuy = (Button) findViewById(R.id.btnHuy);
        Button btntt =  (Button)findViewById(R.id.btnThanhtoan);
        final EditText editten =  (EditText)findViewById(R.id.txtName);
        final EditText editsdt =  (EditText)findViewById(R.id.txtSdt);
        final CheckBox chkdv =  (CheckBox) findViewById(R.id.chkService);
        final RadioButton rbvip =  (RadioButton) findViewById(R.id.rdbVip);
        final RadioButton rbthuong =  (RadioButton) findViewById(R.id.rdbNormal);
        final RadioButton rbgiuong =  (RadioButton) findViewById(R.id.rdbNam);
        final RadioButton rbghe =  (RadioButton) findViewById(R.id.rdbNgoi);
        final Spinner spintt =  (Spinner) findViewById(R.id.spinThanhtoan);
        final int giuong=1200000;
        final int ghe=800000;
        final int dvu=60000;

        btnhuy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cancel(v);

            }
        });



        btntt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float tong=0;
                String vn = "VND";
                String us = spintt.getSelectedItem().toString();
                String msg = "Tên: " + editten.getText().toString() +
                        System.getProperty("line.separator") +
                        "SĐT: " + editsdt.getText().toString()
                        + System.getProperty("line.separator") +
                        "Thành viên: ";

                editten.setText("");
                editsdt.setText("");

                if(rbvip.isChecked())
                    msg += rbvip.getText().toString()+ System.getProperty("line.separator") +"Loại vé: ";
                if(rbthuong.isChecked())
                    msg += rbthuong.getText().toString()+ System.getProperty("line.separator") +"Loại vé: ";

                if(rbgiuong.isChecked())
                    msg += rbgiuong.getText().toString()+ System.getProperty("line.separator") +"Dịch vụ: ";
                if(rbghe.isChecked())
                    msg += rbghe.getText().toString()+ System.getProperty("line.separator") +"Dịch vụ: ";


                if(chkdv.isChecked())
                    msg += "Có";
                else
                    msg += "Không";





                msg += System.getProperty("line.separator") + "Hình thức thanh toán: " +
                        spintt.getSelectedItem().toString()+ System.getProperty("line.separator") ;
                if (rbvip.isChecked())
                {
                    if(rbgiuong.isChecked()&& chkdv.isChecked()) {
                        tong = (giuong + dvu) * 70 / 100;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbghe.isChecked() && chkdv.isChecked())
                    {
                        tong = (ghe + dvu)*70/100;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbgiuong.isChecked())
                    {
                        tong = giuong*70/100;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbghe.isChecked())
                    {
                        tong = ghe*70/100;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                }

                if(rbthuong.isChecked())
                {
                    if(rbgiuong.isChecked()&& chkdv.isChecked()){
                        tong = giuong + dvu;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbghe.isChecked() && chkdv.isChecked())
                    {
                        tong = ghe + dvu;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbgiuong.isChecked())
                    {
                        tong = giuong;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }
                    else if(rbghe.isChecked())
                    {
                        tong = ghe;
                        if (us.equals(vn)) {
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "VNĐ";
                        }
                        else
                        {
                            tong/=20000;
                            msg += System.getProperty("line.separator") + "Thành tiền: " + tong + "USD";
                        }
                    }

                }



                msg+=System.getProperty("line.separator") + "CẢM ƠN QUÝ KHÁCH !!!";

                info(v,msg);

                rbvip.setChecked(false);
                rbthuong.setChecked(false);
                rbgiuong.setChecked(false);
                rbghe.setChecked(false);
                chkdv.setChecked(false);

            }
        });

    }

    public void cancel(View v) {
        System.exit(  0);}

    public void info(View v, String msg){
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
        dlgAlert.setMessage(msg);
        dlgAlert.setTitle("Thông Tin ");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
    }

}
