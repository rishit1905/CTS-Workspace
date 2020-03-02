import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'verbal'
})
export class VerbalPipe implements PipeTransform {
  digits=['Zero','One','Two','Three','Four','Five','Six','Seven','Eight','Nine'];
  transform(value: number, args?: any): string {
    let str=`${value}`;
    let result='';

    for(let i=0;i<str.length;i++){
      let digit=parseInt(str.charAt(i));
      result=`${result} ${this.digits[digit]}`;
    }
    return result;
  }

}
