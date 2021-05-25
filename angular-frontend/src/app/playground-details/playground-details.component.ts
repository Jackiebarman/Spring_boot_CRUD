import { Component, OnInit } from '@angular/core';
import { Playground } from '../playground';
import { ActivatedRoute } from '@angular/router';
import { PlaygroundService } from '../playground.service';

@Component({
  selector: 'app-playground-details',
  templateUrl: './playground-details.component.html',
  styleUrls: ['./playground-details.component.css']
})
export class PlaygroundDetailsComponent implements OnInit {

  id: number
  playground: Playground
  constructor(private route: ActivatedRoute, private playgroundService: PlaygroundService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.playground = new Playground();
    this.playgroundService.getPlaygroundById(this.id).subscribe( data => {
      this.playground = data;
    });
  }

}
