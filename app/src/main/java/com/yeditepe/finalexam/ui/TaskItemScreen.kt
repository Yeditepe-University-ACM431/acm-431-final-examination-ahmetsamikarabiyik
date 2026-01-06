package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    // TODO 1: Completion state (initial = false)
    var isCompleted by remember { mutableStateOf(false) }
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(8.dp))
        // TODO 2: Show status text
        Text(
            text = if (isCompleted) "Completed" else "Not Completed",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                // TODO 3: Toggle state
                isCompleted = !isCompleted
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    // TODO: Call TaskItemScreen
}
