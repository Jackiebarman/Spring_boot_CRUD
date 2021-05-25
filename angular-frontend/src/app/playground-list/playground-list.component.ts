import { Component, OnInit } from '@angular/core';
import { Playground } from '../playground';
import { PlaygroundService } from '../playground.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-playground-list',
  templateUrl: './playground-list.component.html',
  styleUrls: ['./playground-list.component.css']
})
export class PlaygroundListComponent implements OnInit {
  public users = [];
  public employees2 = [];
  playgrounds: Playground[];
  public users2 = [];
  constructor(private playgroundService:PlaygroundService,private router: Router) { }

  ngOnInit() {         
     this.getPlaygrounds();
 
  }
  private getPlaygrounds(){
    this.playgroundService.getPlaygroundsList().subscribe(data =>{
      this.playgrounds = data;
    });
  }

  playgroundDetails(id: number){
    this.router.navigate(['playground-details', id]);
  }

  updatePlayground(id: number){
    this.router.navigate(['update-playground', id]);
  }

  deletePlayground(id: number){
    this.playgroundService.deletePlayground(id).subscribe( data => {
      console.log(data);
      this.getPlaygrounds();
    })
  }

}
