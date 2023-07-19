package cl.jpvs.mod5ej15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/* paso para crear listado  usando recycled view
* (x) item Layout
*   (*) agregar constrains
*   (x) cambiar altura de constrains layout de item layout a wrap content
*   (x) definir ID
* (x) layout con recycler view
*     () agregar en activity_main.xml app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
* () Adapter + view holder
*
* () asignar layout manager
*  () obtener los datos
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}