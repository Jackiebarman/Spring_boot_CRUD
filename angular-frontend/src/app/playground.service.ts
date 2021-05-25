import { Injectable } from '@angular/core';
import {HttpClient,HttpErrorResponse} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Playground } from './playground';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { CreatePlaygroundComponent } from './create-playground/create-playground.component';
@Injectable({
  providedIn: 'root'
})
export class PlaygroundService {

  private baseURL: string = "http://localhost:8080/addPlayground";
  private delURL = "http://localhost:8080/delete";
  private getidURL = "http://localhost:8080/getPlayground";
  private updateURL = "http://localhost:8080/update";
  private _url: string = "http://localhost:8080/getPlaygrounds";
  constructor(private httpClient: HttpClient) { }

  getPlaygroundsList(): Observable<Playground[]>{
    return this.httpClient.get<Playground[]>(this._url)
    .catch(this.errorHandler);
  }

  getPlaygroundById(id: number): Observable<Playground>{
    return this.httpClient.get<Playground>(`${this.getidURL}/${id}`);
  }

  createPlayground(playground:Playground): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, playground);
    
  }

    deletePlayground(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.delURL}/${id}`);
  }


  updatePlayground(id: number, playground: Playground): Observable<Object>{
    return this.httpClient.put(`${this.updateURL}/${id}`, playground);
  }

  errorHandler(error: HttpErrorResponse){
    return Observable.throw(error.message || "Server Error");
  }
}





