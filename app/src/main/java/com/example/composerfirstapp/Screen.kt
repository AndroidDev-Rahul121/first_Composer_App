package com.example.composerfirstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(heightDp = 500)
@Composable
fun PreviewItem(){
//BlogCategory(img = R.drawable.ic_launcher_background, title = "Programming", subtitle ="Learn Different Languages" )
LazyColumn(content = {
    items(getCategory()){
        BlogCategory(img = it.img, title = it.title, subtitle =it.subtitle )
    }

})

//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategory().map {
//            BlogCategory(it.img,it.title,it.subtitle)
//        }
//
//    }

}


@Composable
fun BlogCategory(img:Int,title:String,subtitle:String) {
    Card(

        modifier = Modifier.padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)) {
            // Add your content here
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle,Modifier.weight(.8f))

        }
    }

}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Thin
        )

    }
}


data class Category(val img:Int, val title: String,val subtitle: String)


fun getCategory():MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))
    list.add(Category(R.drawable.ic_launcher_background,"Programming","Learn Different Languages"))

    return list
}