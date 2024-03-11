package dev.farhan.dsp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddFormScreen() {
    var commentsText by rememberSaveable { mutableStateOf("") }

    val isWalkingSelected by rememberSaveable { mutableStateOf(false) }
    val isExerciseSelected by rememberSaveable { mutableStateOf(false) }
    val isYogaSelected by rememberSaveable { mutableStateOf(false) }
    val isHangingSelected by rememberSaveable { mutableStateOf(false) }
    val isHardWorkSelected by rememberSaveable { mutableStateOf(false) }
    val isMediumWorkSelected by rememberSaveable { mutableStateOf(false) }

    val isPrescribedYogaSelected by rememberSaveable { mutableStateOf(false) }
    val isPrescribedDanceSelected by rememberSaveable { mutableStateOf(false) }
    val isPrescribedExerciseSelected by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(16.dp, 16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = stringResource(id = R.string.add_data),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.displaySmall
        )

        Spacer(modifier = Modifier.padding(8.dp))

        // feeling input starts here
        Text(
            text = stringResource(id = R.string.feeling),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Poor") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Average") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Good") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Best") })
        }
        // feeling input ends here

        Spacer(modifier = Modifier.padding(8.dp))

        // sleep quality input starts here
        Text(
            text = stringResource(id = R.string.sleep),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Poor") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Average") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Good") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Best") })
        }
        // sleep quality input ends here

        Spacer(modifier = Modifier.padding(8.dp))

        // stress level input starts here
        Text(
            text = stringResource(id = R.string.stress),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("1") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("2") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("3") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("4") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("5") })
        }
        // stress level input ends here

        Spacer(modifier = Modifier.padding(8.dp))

        // activity input starts here
        Text(
            text = stringResource(id = R.string.activity),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isWalkingSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Walking/Jogging") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )

            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isExerciseSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Exercise") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )
        }

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isYogaSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Yoga") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )

            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isHangingSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Hanging out") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )
        }

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isHardWorkSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Hard work") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )

            FilterChip(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                selected = isMediumWorkSelected,
                onClick = { /*TODO*/ },
                label = { Text(text = "Medium work") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Selected"
                    )
                }
            )
        }
        // activity input ends here

        Spacer(modifier = Modifier.padding(8.dp))

        // social prescribing input starts here
        Text(
            text = stringResource(id = R.string.social_prescribing),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("Yes") })
            SuggestionChip(onClick = { /*TODO*/ }, label = { Text("No") })
        }
        // social prescribing input ends here

        Spacer(modifier = Modifier.padding(8.dp))

        // prescribed activity input starts here
        Text(
            text = stringResource(id = R.string.prescribed_activity),
            style = MaterialTheme.typography.bodyLarge
        )

        Row (
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    selected = isPrescribedYogaSelected,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Yoga") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "Selected"
                        )
                    }
                )

                FilterChip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    selected = isPrescribedDanceSelected,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Dance") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "Selected"
                        )
                    }
                )

                FilterChip(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    selected = isPrescribedExerciseSelected,
                    onClick = { /*TODO*/ },
                    label = { Text(text = "Exercise") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = "Selected"
                        )
                    }
                )
            }
        }
        // prescribed activity input ends here

        Spacer(modifier = Modifier.padding(8.dp))
        
        Text (
            text = stringResource(id = R.string.comments),
            style = MaterialTheme.typography.bodyLarge
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = commentsText,
            onValueChange = { commentsText = it },
            placeholder = { Text(text = "Anything else?") }
        )

        Spacer(modifier = Modifier.padding(8.dp))
    }
}