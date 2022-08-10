package com.example.compose.Screens

import android.widget.ImageView
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R
import com.example.compose.ui.theme.Teal200
import kotlinx.coroutines.processNextEventInCurrentThread

@Composable
fun LogInPage () {
    Column (
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ){

        // top design
        topView()

        //space b/w design and fields
        Box(modifier = Modifier.height(100.dp))

        //signup text
        signup_field()

        //login field
        login_fields()
    }
}

// signup button
@Composable
fun signup_field(){
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        //text
        Text(text = "Don't have an account ?. ")

        //button
        TextButton(
            onClick = { /*TODO*/ },
        ) {
            Text(text = "Sign Up", color = Color(0xFF86DC3D))
        }
    }
}


//login fields
@Composable
fun login_fields(){

    // initializing email and password variables
    var email by remember { mutableStateOf (TextFieldValue("")) }
    var password by remember { mutableStateOf (TextFieldValue("")) }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {


        //email textfield
        OutlinedTextField(
            modifier = Modifier.width(550.dp),
            value = email,
            placeholder = { Text(text = "Email")},
            leadingIcon = { Icon(imageVector = Icons.Filled.Email, contentDescription = "")},
            onValueChange = { email = it },
            singleLine =  true,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            shape = RoundedCornerShape(30.dp)
        )

        //space b/w email and password
        Box(modifier = Modifier.height(20.dp))

        //password textfield
        OutlinedTextField(
            modifier = Modifier.width(550.dp),
            value = password,
            placeholder = { Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = { Icon(imageVector = Icons.Filled.Lock, contentDescription = "")},
            onValueChange = { password = it },
            singleLine =  true,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            shape = RoundedCornerShape(30.dp)
        )


        //space b/w password and login btn
        Box(modifier = Modifier.height(20.dp))

        //login btn
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(550.dp)
                .height(60.dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF86DC3D))
        ) {
            Text(text = "Log In")
            Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "")
        }
    }
}


// top design part
@Composable
fun topView(){

    //box with bg color and a massive curve at the bottom right corner
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(bottomEnd = 700.dp))
            .fillMaxWidth()
            .height(300.dp)
            .background(Color(0xFF86DC3D))
    ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            ) {

                // W E L C O M E text
                Text(
                    text = "W E L \nC O M E .",
                    color = Color.White,
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontStyle = FontStyle.Italic,
                )
            }
    }
}

