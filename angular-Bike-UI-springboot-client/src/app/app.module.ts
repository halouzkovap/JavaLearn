import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BikeListComponent } from './bike-list/bike-list.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { CreateBikeComponent } from './create-bike/create-bike.component';
import { UpdateBikeComponent } from './update-bike/update-bike.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    BikeListComponent,
    BikeDetailsComponent,
    CreateBikeComponent,
    UpdateBikeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
