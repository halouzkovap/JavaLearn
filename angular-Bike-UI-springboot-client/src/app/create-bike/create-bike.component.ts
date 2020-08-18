import { BikeService } from '../bike.service';
import { Bike } from '../bike';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-bike',
  templateUrl: './create-bike.component.html',
  styleUrls: ['./create-bike.component.css']
})
export class CreateBikeComponent implements OnInit {

  bike: Bike = new Bike();
  submitted = false;

  constructor(private bikeService:BikeService, private router:Router) { }

  ngOnInit(): void {
  }
  newBike(): void {
    this.submitted = false;
    this.bike = new Bike();
  }

  save() {
    this.bikeService.createBike(this.bike)
      .subscribe(data => console.log(data), error => console.log(error));
    this.bike = new Bike();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/bike']);
  }
}
