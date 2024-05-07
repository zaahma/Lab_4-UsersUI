package com.topic2.android.notes.ui.components
import android.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
private fun AppDrawerHeader(){
    Row(modifier = Modifier.fillMaxSize()){
        Image(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Drawer Header Icon",
                colorFilter = ColorFilter
                        colorFilter = androidx.compose.ui.graphics.ColorFilter
                        .tint(MaterialTheme.colors.onSurface),
                modifier = Modifier.padding(16.dp)
        )
    }
}
@Preview
@Composable
fun AppDrawerHeaderPreview(){
    JetNotesTheme{
        AppDrawerHeader()
    }
}