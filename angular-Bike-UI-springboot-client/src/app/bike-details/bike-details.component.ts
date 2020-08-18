import { Bike } from '../bike';
import { Component, OnInit, Input } from '@angular/core';
import { BikeService } from '../bike.service';
import { BikeListComponent } from '../bike-list/bike-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-bike-details',
  templateUrl: './bike-details.component.html',
  styleUrls: ['./bike-details.component.css']
})
export class BikeDetailsComponent implements OnInit {

  id: number;
  bike: Bike;

  constructor(private route: ActivatedRoute,private router: Router,
    private bikeService: BikeService) { }

  ngOnInit(): void { this.bike = new Bike();

    this.id = this.route.snapshot.params['id'];
    
    this.bikeService.getBike(this.id)
      .subscribe(data => {
        console.log(data)
        this.bike = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['bike']);
  }

}
