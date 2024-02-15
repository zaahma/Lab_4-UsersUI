import android.media.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter.Companion.tint
import java.util.logging.Filter

@Composable
Private fun App Drawer Header() {
    Row(modifier = Modifier.fill MaxWidth())
    { { this: Row Scope
        Image(
            image Vector = Icons.Filled.Menu,
            content Description = "Drawer Header Icon",
            color Filter = Color Filter
                    ..tint(Material Theme.colors.on Surface),
            modifier = Modifier.padding(16.dp)
                    Text(
                    text = "Заметки",
            modifier = Modifier
                    ..align(alignment = Alignment.Center Vertically)
            @Preview
            @Composable
            Fun App Drawer Header Preview() {
                Jet Notes Theme {
                    App Drawer Header()