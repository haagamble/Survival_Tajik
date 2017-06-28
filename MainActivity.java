package com.talktajiktoday.survivaltajik;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView meeting = (TextView) findViewById(R.id.meeting);
        meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meetingIntent = new Intent(MainActivity.this, MeetingActivity.class);
                startActivity(meetingIntent);
            }
        });

        TextView firstPhrases = (TextView) findViewById(R.id.first_phrases);
        firstPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, FirstPhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        TextView fruitVeg = (TextView) findViewById(R.id.fruit_veg);
        fruitVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fruitIntent = new Intent(MainActivity.this, FruitVegActivity.class);
                startActivity(fruitIntent);
            }
        });

        TextView colours = (TextView) findViewById(R.id.colours);
        colours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coloursIntent = new Intent(MainActivity.this, ColoursActivity.class);
                startActivity(coloursIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView daysMonths = (TextView) findViewById(R.id.days_months);
        daysMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daysIntent = new Intent(MainActivity.this, DaysAndMonthsActivity.class);
                startActivity(daysIntent);
            }
        });

        TextView calendar = (TextView) findViewById(R.id.calendar);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendarIntent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(calendarIntent);
            }
        });

        TextView animals = (TextView) findViewById(R.id.animals);
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(animalsIntent);
            }
        });

        TextView body = (TextView) findViewById(R.id.body);
        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bodyIntent = new Intent(MainActivity.this, BodyActivity.class);
                startActivity(bodyIntent);
            }
        });

        TextView clothes = (TextView) findViewById(R.id.clothes);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clothesIntent = new Intent(MainActivity.this, ClothesActivity.class);
                startActivity(clothesIntent);
            }
        });

        TextView adjectives = (TextView) findViewById(R.id.adjectives);
        adjectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adjectivesIntent = new Intent(MainActivity.this, AdjectivesActivity.class);
                startActivity(adjectivesIntent);
            }
        });


        TextView house = (TextView) findViewById(R.id.house);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent houseIntent = new Intent(MainActivity.this, HouseActivity.class);
                startActivity(houseIntent);
            }
        });

        TextView kitchen = (TextView) findViewById(R.id.kitchen);
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kitchenIntent = new Intent(MainActivity.this, KitchenActivity.class);
                startActivity(kitchenIntent);
            }
        });

        TextView living = (TextView) findViewById(R.id.living_room);
        living.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent livingIntent = new Intent(MainActivity.this, LivingRoomActivity.class);
                startActivity(livingIntent);
            }
        });

        TextView bathroom = (TextView) findViewById(R.id.bathroom);
        bathroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bathroomIntent = new Intent(MainActivity.this, BathroomActivity.class);
                startActivity(bathroomIntent);
            }
        });

        TextView bedroom = (TextView) findViewById(R.id.bedroom);
        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bedroomIntent = new Intent(MainActivity.this, BedroomActivity.class);
                startActivity(bedroomIntent);
            }
        });

        TextView travel = (TextView) findViewById(R.id.travel);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travelIntent = new Intent(MainActivity.this, TravelActivity.class);
                startActivity(travelIntent);
            }
        });

        TextView city = (TextView) findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cityIntent = new Intent(MainActivity.this, CityActivity.class);
                startActivity(cityIntent);
            }
        });

        TextView outofcity = (TextView) findViewById(R.id.out_of_city);
        outofcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outofcityIntent = new Intent(MainActivity.this, OutOfCityActivity.class);
                startActivity(outofcityIntent);
            }
        });

        TextView weather = (TextView) findViewById(R.id.weather);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weatherIntent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(weatherIntent);
            }
        });

        TextView nature = (TextView) findViewById(R.id.nature);
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(natureIntent);
            }
        });

        TextView language = (TextView) findViewById(R.id.learning_language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent languageIntent = new Intent(MainActivity.this, LanguageActivity.class);
                startActivity(languageIntent);
            }
        });

        TextView jobs = (TextView) findViewById(R.id.occupations);
        jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jobsIntent = new Intent(MainActivity.this, OccupationsActivity.class);
                startActivity(jobsIntent);
            }
        });

        TextView verbs = (TextView) findViewById(R.id.verbs);
        verbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verbsIntent = new Intent(MainActivity.this, VerbsActivity.class);
                startActivity(verbsIntent);
            }
        });




    }
}
