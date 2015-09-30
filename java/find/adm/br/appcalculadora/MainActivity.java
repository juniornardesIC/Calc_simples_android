package find.adm.br.appcalculadora;


import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnSomar;
    private Button btnSub;
    private Button btnDiv;
    private Button btnMult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSomar.setOnClickListener(new View.OnClickListener() {

            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {
                String v1 = edtValor1.getText().toString();
                String v2 = edtValor2.getText().toString();

                if (v1.trim().isEmpty() || v2.trim().isEmpty()) {

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(R.string.msn2);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                } else {


                    double vl1 = Double.parseDouble(edtValor1.getText().toString());
                    double vl2 = Double.parseDouble(edtValor2.getText().toString());

                    double result = vl1 + vl2;

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(getString(R.string.msnSoma) + result);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                }
            }
        });

        btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {
                String v1 = edtValor1.getText().toString();
                String v2 = edtValor2.getText().toString();

                if (v1.trim().isEmpty() || v2.trim().isEmpty()) {

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(R.string.msn2);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                } else {


                    double vl1 = Double.parseDouble(edtValor1.getText().toString());
                    double vl2 = Double.parseDouble(edtValor2.getText().toString());

                    double result = vl1 - vl2;

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(getString(R.string.msnSubtracao) + result);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                }
            }
        });

        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {

                String v1 = edtValor1.getText().toString();
                String v2 = edtValor2.getText().toString();

                if (v1.trim().isEmpty() || v2.trim().isEmpty()) {

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(R.string.msn2);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                } else {


                    double vl1 = Double.parseDouble(edtValor1.getText().toString());
                    double vl2 = Double.parseDouble(edtValor2.getText().toString());

                    double result = vl1 / vl2;

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(getString(R.string.msnDivicao) + result);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                }
            }
        });

        btnMult = (Button) findViewById(R.id.btnMult);
        btnMult.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {
                String v1 = edtValor1.getText().toString();
                String v2 = edtValor2.getText().toString();

                if (v1.trim().isEmpty() || v2.trim().isEmpty()) {

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(getString(R.string.msn2));
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                } else {


                    double vl1 = Double.parseDouble(edtValor1.getText().toString());
                    double vl2 = Double.parseDouble(edtValor2.getText().toString());

                    double result = vl1 * vl2;

                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage(getString(R.string.msn1) + result);
                    dlg.setNeutralButton("ok", null);
                    dlg.show();
                }
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
