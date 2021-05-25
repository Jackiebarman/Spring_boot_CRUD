import { Component, OnInit } from '@angular/core';
import { Playground } from '../playground';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { PlaygroundService } from '../playground.service';
@Component({
  selector: 'app-create-playground',
  templateUrl: './create-playground.component.html',
  styleUrls: ['./create-playground.component.css']
})
export class CreatePlaygroundComponent implements OnInit {
  exist=false;
  submitted=false;
  playground: Playground = new Playground();
  constructor(public _http:HttpClient,private router: Router,private playgroundService:PlaygroundService) { }


  ngOnInit() {
  }

  savePlayground(){
     this.playgroundService.createPlayground(this.playground).subscribe( data =>{
        console.log(data);
        console.log(this.playground);
       this.goToPlaygroundList();
     },
     error => console.log(error));
  }

  goToPlaygroundList(){
    this.router.navigate(['/getPlayground']);
  }
  
  onSubmit(){
    //console.log(this.playground);
    this.savePlayground();
  }
}
