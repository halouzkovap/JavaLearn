import { BikeDetailsComponent } from '../bike-details/bike-details.component';
import { Observable } from "rxjs/observable";
import { BikeService } from "../bike.service";
import { Bike } from "../bike";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: 'app-bike-list',
  templateUrl: './bike-list.component.html',
  styleUrls: ['./bike-list.component.css']
})
export class BikeListComponent implements OnInit {
 bikes : Observable<Bike[]>;
  constructor(private bikeService:BikeService, private router:Router) { }

  ngOnInit(): void {
  this.reloadData();
  }

  reloadData(){
    this.bikes = this.bikeService.getBikeList();
  }

  deleteBike(id: number) {
    this.bikeService.deleteBike(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  BikeDetails(id: number){
    this.router.navigate(['details', id]);
  }

}
