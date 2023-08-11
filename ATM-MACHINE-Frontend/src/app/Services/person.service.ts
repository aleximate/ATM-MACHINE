import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Person } from '../Interfaces/person';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
  private api:string=`${environment.baseUrl}/persons/v0`


  constructor(private http:HttpClient) { }

  register(person:Person):Observable<Person>{
    return this.http.post<Person>(this.api,person);
  }



}
