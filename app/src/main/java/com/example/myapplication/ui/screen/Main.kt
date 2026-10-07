package com.example.myapplication.ui.screen
import androidx.compose.runtime.*
import com.example.myapplication.model.Producto
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
@Composable
fun Main() {
    var productoSeleccionado by remember { mutableStateOf<Producto?>(null) }
    if (productoSeleccionado == null) {
        Formulario(onNavegarADetalle = { producto ->
            productoSeleccionado = producto
        })
    } else {
        ProductoDetalle(
            producto = productoSeleccionado!!,
            onVolver = { productoSeleccionado = null }
        )
    }
}