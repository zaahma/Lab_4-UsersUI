

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.RowScope.weight
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.theme.rwGreen
import androidx.compose.ui.Modifier

@Composable fun Note() {
    Row(modifier = Modifier.fillMaxWidth())
    Box(

        modifier = Modifier
            .size(40.dp)
            .background(rwGreen)

    )
    Column(modifier = Modifier.weight(1f)) {
        Text(text = "Заголовок",maxlines = 1)
        Text(text = "Содержимое",maxlines = 1)

    }

    Checkbox(checked = false, onCheckedChange ={}, modifier = Modifier.padding(
        start = 8.dp
    ) )

}

fun Text(text: String, maxlines: Int) {

}

@Preview
@Composable
private fun NotePreview() { Note()


}

