import { HttpClient } from '@angular/common/http';
import { Component, inject, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

interface Demo {

  id: string,
  content: string,
  isActive: boolean
}

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {

  private http = inject(HttpClient);
  public demoList = signal([] as Demo[]);
  
  ngOnInit() {
    this.http.get<Demo[]>("http://localhost:8080/api/demo")
      .subscribe((data) => this.demoList.set(data));
  }
}
