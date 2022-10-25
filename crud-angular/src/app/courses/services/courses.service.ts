import { Course } from './../model/course';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  constructor() { }

  list(): Course[] {
    return [ { _id: '1', name: 'Angular', category: 'front'} ]
  }

}
