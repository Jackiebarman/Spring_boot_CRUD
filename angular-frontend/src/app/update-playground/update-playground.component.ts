import { Component, OnInit } from '@angular/core';
import { Playground } from '../playground';
import { PlaygroundService } from '../playground.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-playground',
  templateUrl: './update-playground.component.html',
  styleUrls: ['./update-playground.component.css']
})
export class UpdatePlaygroundComponent implements OnInit {

  id: number;
  playground: Playground= new Playground();
  constructor(private playgroundService: PlaygroundService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.playgroundService.getPlaygroundById(this.id).subscribe(data => {
      this.playground = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.playgroundService.updatePlayground(this.id, this.playground).subscribe( data =>{
      this.goToplaygroundList();
    }
    , error => console.log(error));
  }

  goToplaygroundList(){
    this.router.navigate(['/getPlayground']);
  }

}
