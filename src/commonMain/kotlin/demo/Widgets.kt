package demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

val ApplicationTitle = "Simple UI"

@Composable
fun SimpleUi(){
    Column(Modifier.fillMaxSize().background(Color(0xFFf4dbff))) {
        var switched by remember { mutableStateOf(false) }
        Text("Switch Example:")
        Switch(modifier = Modifier.padding(16.dp), checked = switched, onCheckedChange = { switched = it })
        Text("Checkbox Example:")
        Checkbox(modifier = Modifier.padding(16.dp), checked = switched, onCheckedChange = { switched = it })
        Text("Material Button Example:")
        Button(modifier = Modifier.padding(16.dp), onClick = { switched = !switched }) {
            Text("Click me!")
        }
    }
}
