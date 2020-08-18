import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';
import { ActivatedRoute, Router } from '@angular/router';
import { BikeService } from '../bike.service';

@Component({
  selector: 'app-update-bike',
  templateUrl: './update-bike.component.html',
  styleUrls: ['./update-bike.component.css']
})
export class UpdateBikeComponent implements OnInit {

  id: number;
  bike: Bike;

  constructor(private route: ActivatedRoute,private router: Router,
    private bikeService: BikeService) { }

  ngOnInit(): void {
    this.bike = new Bike();
    this.id = this.route.snapshot.params['id'];
    
    this.bikeService.getBike(this.id)
      .subscribe(data => {
        console.log(data)
        this.bike = data;
      }, error => console.log(error));
  }
  updateBike() {
    this.bikeService.updateBike(this.id, this.bike)
      .subscribe(data => console.log(data), error => console.log(error));
    this.bike = new Bike();
    this.gotoList();
  }

  onSubmit() {
    this.updateBike();    
  }

  gotoList() {
    this.router.navigate(['/bike']);
  }
}
