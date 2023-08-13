import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { Person } from 'src/app/Interfaces/person';
import { PersonService} from 'src/app/Services/person.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{

  cardForm!: FormGroup;


  constructor(
    private formBuilder:FormBuilder,
    private personService:PersonService,
    private router:Router
  ){}
  ngOnInit(): void {
    this.cardForm=this.formBuilder.group({
      firstName:[null,Validators.required],
      lastName:[null,Validators.required],
      dni:[null,Validators.required],
      email:['',Validators.required],
      cellPhone:['',Validators.required],
      address:['',Validators.required]
    })
  }

  register(){
    if(this.cardForm.valid){
      console.log(this.cardForm.value)
      const personData:Person=this.cardForm.value;
      this.personService.register(personData).subscribe({
        next:()=>{
          console.log('Person register')
          this.router.navigate(['/register/card'])
        },
        error:(e)=>{
          console.log('errorrrr',e)
        }

      })
    }
  }

}
