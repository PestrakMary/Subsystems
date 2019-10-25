import {Component, Input, OnInit} from '@angular/core';
import {isHiddenFromScreenReader} from 'codelyzer/util/isHiddenFromScreenReader';

import {SystemObject} from "../SystemObject";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})

export class ChildComponent implements OnInit {
  @Input() systemObj: SystemObject = new SystemObject();

  constructor(private http: HttpClient) {
  }


  systemObjects: SystemObject[];

  ngOnInit() {

  }



  getReq() {
    this.http.get('http://localhost:8080/unnamed/subsystems').subscribe((obj:SystemObject[])=>{this.systemObjects = obj});
  }

postReq(){
    this.http.post('http://localhost:8080/unnamed/subsystems', this.systemObj).subscribe();
  }
}
