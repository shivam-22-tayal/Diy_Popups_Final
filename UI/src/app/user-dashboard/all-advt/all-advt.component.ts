import { Component, OnInit } from '@angular/core';
import { AdvertisementService } from 'src/app/advertisement.service';

@Component({
  selector: 'app-all-advt',
  templateUrl: './all-advt.component.html',
  styleUrls: ['./all-advt.component.css']
})
export class AllAdvtComponent implements OnInit {

  constructor(private service: AdvertisementService) { }

  ngOnInit() {
  }

}
