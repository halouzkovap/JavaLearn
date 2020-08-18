import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { CreateBikeComponent } from './create-bike/create-bike.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BikeListComponent } from './bike-list/bike-list.component';
import { UpdateBikeComponent } from './update-bike/update-bike.component';

const routes: Routes = [
  { path: '', redirectTo: 'bike', pathMatch: 'full' },
  { path: 'bikes', component: BikeListComponent },
  { path: 'add', component: CreateBikeComponent },
  { path: 'update/:id', component: UpdateBikeComponent },
  { path: 'details/:id', component: BikeDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
