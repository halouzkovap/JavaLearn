import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/observable';
import { Bike } from './bike';

@Injectable({
  providedIn: 'root'
})
export class BikeService {

  private baseUrl = 'http://localhost:8080/api/v1/bikes';

  constructor(private http: HttpClient) { }

  getBike(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createBike(employee: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, Bike);
  }

  updateBike(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteBike(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getBikeList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
