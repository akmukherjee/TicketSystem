<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/formvalidation/0.6.1/css/formValidation.min.css"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/formvalidation/0.6.1/js/formValidation.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/formvalidation/0.6.1/js/framework/bootstrap.min.js"></script>
    
    <style>
    .section_heading{
        width: auto;
        margin: 5px;
        color: #FFFFFF;
        background: darkorange;
        background-size: cover;
        background-repeat: repeat;
        background-position: 50% 50%;
        border-radius: 4px;
        font-weight: bold;
        font-size: 18px;
        padding: 20px 1em;
        text-align: center;
      
    }
    .image_style{
        display: block;
        width: auto;
        margin-left: auto;
        margin-right: auto
        }
        .empty_area{
            width: auto;
            height: 100px;
            vertical-align: middle;
            background: white;
            font-weight: bold;
            text-align: center;
            font-size: 38px;
            color: saddlebrown;
        }
        .section_heading2{
        width: auto;
        height: 10px;
        margin: 5px;
        color: #FFFFFF;
        background: darkorange;
        background-size: cover;
        background-repeat: repeat;
        background-position: 50% 50%;
        border-radius: 4px;
        font-weight: bold;
        font-size: 18px;
        padding: 20px 1em;
        text-align: center;
        line-height:1px;
    } 
        .ticketSelector{
            text-align: left;
        }
        .ticketTable{
            text-align: center;
        }
        .ticketPmtLabel{
            text-align: left;
            font-weight: bold;
            font-size: 20;

        }
        .ticketCost{
            text-align: left;
            color: darkorange;
            font-weight: bold;
            font-size: 20;
            
        }
        .paymentSel{
            text-align: center;
        }
</style>
  </head>
    
    <body>
        <div class="container">
            <div class="row row-content">
              <img src="http://www.chinmayamission.com/wp-content/uploads/2014/07/ccmt-banr.jpg" class="img-responsive image_style" >
            </div>
            <div>    
              <p class="empty_area">Welcome to Geet Ramayana 2016</p>
            </div>    
           
            <div class="section_heading">Personal Information</div>
            <div class="row row-content">
                <form id="ticketForm">

                            <div class="form-group col-xs-6">
                                <input type="text"  class="form-control" name="firstName" id="firstName" placeholder="First Name"                                      id="firstName"/>
                            </div>
                             <div class="form-group  col-xs-6">
                                <input type="text"  class="form-control" name="lastName" id="lastName" placeholder="Last Name"                                          id="lastName" />
                            </div>
                             <div class="form-group col-xs-6">
                                <input type="email"  class="form-control" name="email" id="email" placeholder="Email Address" />
                            </div>
                             <div class="form-group  col-xs-6">
                                <input type="text"  data-fv-phone="true" data-fv-phone-country="US" data-fv-phone-message="Please enter a valid US Phone Number" class="form-control" name="phone" id="phone" placeholder="Phone Number" id="phone"/>
                            </div>
                            <div class="form-group  col-xs-12">
                                <input type="text"  class="form-control" name="addressL1" id="addressL1" placeholder="Address Line 1"                                  />
                            </div>
                             <div class="form-group  col-xs-12">
                                <input type="text"  class="form-control" id="addressL2" placeholder="Address Line 2" />
                            </div>
                            <div class="form-group  col-xs-4">
                                <input type="text"  class="form-control" name="city" id="city" placeholder="City" required/>
                            </div>
                            <div class="form-group  col-xs-4">
                                <input type="text"  class="form-control" name="state" id="state" placeholder="State" id="state" />
                            </div>
                            <div class="form-group  col-xs-4">
                                <input type="text"  class="form-control" data-fv-zipcode-country="US" data-fv-zipcode-message="Please enter a valid US Zip Code" data-fv-zipcode="true" name="zip" id="zip"     placeholder="Zip" id="zip"/>
                            </div>
                    
        </div>
        <div class="section_heading">Preferences</div>
                <div class="row row-content">
                    <div class="col-xs-6">
                        <div class="section_heading2">Ticket Preferences</div>
                       <div class="radio">
                          <label><input type="radio" name="optradio" id="chinmayaSom">Chinmaya Chantilly, VA</label>
                        </div>
                        <div class="radio">
                          <label><input type="radio" name="optradio" id="chinmayaSilverSpring">Chinmaya Silver Spring, MD</label>
                        </div>
                        <div class="radio">
                          <label><input type="radio" name="optradio"  id="chinmayaFredrick">Chinmaya Fredrick, MD</label>
                        </div>
                        <div class="radio">
                          <label><input type="radio" name="optradio" id="atVenue">At Venue</label>
                        </div> 
                    
                    </div>
                    <div class="form-group col-xs-6">
                        <div class="section_heading2">Other Preferences</div>
                        <div class="checkbox">
                          <label><input type="checkbox" value="" id="ChildCare">ChildCare Needed</label>
                        </div>
                        <div class="checkbox">
                          <label><input type="checkbox" value="" id="specialAssistance">Special Assistance Needed</label>
                        </div>
                        <div class="checkbox">
                          <label><input type="checkbox" value="" id="promotionalEmail">Opt-in for future program promotional emails</label>
                        </div>
        
                    </div>

                    
                
                
                
                </div>

        <div class="section_heading">Ticket Selection</div>

        <div class="form-group col-xs-12">
            <table class="table ticketTable">
                <thead>
                    <th>Event Options</th>
                    <th>Adult Tickets</th>
                    <th>Child Tickets</th>
                    <th>Youth Tickets</th>
                    
                </thead>
                <tbody>
                    <tr><th scope="row">Saturday Front Section</th>
                        <td class="ticketSelector" id="adultSatFront"></td>
                        <td class="ticketSelector" id="childSatFront"></td>
                        <td class="ticketSelector" id="youthSatFront"></td>             
                    </tr>
                    <tr><th scope="row">Sunday Front Section</th>
                        <td class="ticketSelector" id="adultSunFront"></td>
                        <td class="ticketSelector" id="childSunFront"></td>
                        <td class="ticketSelector" id="youthSunFront"></td>             
                    </tr>
                    <tr><th scope="row">Both Days Front Section</th>
                        <td class="ticketSelector" id="adultBothFront"></td>
                        <td class="ticketSelector" id="childBothFront"></td>
                        <td class="ticketSelector" id="youthBothFront"></td>             
                    </tr>                
                    <tr><th scope="row">Saturday Back Section</th>
                        <td class="ticketSelector" id="adultSatBack"></td>
                        <td class="ticketSelector" id="childSatBack"></td>
                        <td class="ticketSelector" id="youthSatBack"></td>             
                    </tr>
                    <tr><th scope="row">Sunday Back Section</th>
                        <td class="ticketSelector" id="adultSunBack"></td>
                        <td class="ticketSelector" id="childSunBack"></td>
                        <td class="ticketSelector" id="youthSunBack"></td>             
                    </tr>
                    <tr><th scope="row">Both Days Back Section</th>
                        <td class="ticketSelector" id="adultBothBack"></td>
                        <td class="ticketSelector" id="childBothBack"></td>
                        <td class="ticketSelector" id="youthBothBack"></td>             
                    </tr> 
                    </tbody>
                    <tfoot>
                       <tr><th scope="row"></th></td>
                        <td></td>
                        <td class="ticketPmtLabel">Total Payment</td>
                        <td id="totalPayment" class="ticketCost" style="width:20px">$0.00</td>             
                    </tfoot>        
            </table>
                    <div class="section_heading">Payment Method</div>
                <div class="row row-content" class="paymentSel">
                    <div class="col-xs-4">
                        <div class="radio">
                          <label><input type="radio" name="pmtRadio" value="Credit Card">Credit Card</label>
                        </div>
                    
                    </div>
                    <div class="col-xs-4">
                        <div class="radio">
                          <label><input type="radio" name="pmtRadio" value="E-Check">E-Check</label>
                      </div>
                    
                    </div>                
                    <div class="col-xs-4">
                        <div class="radio" style="display: inline-block; text-align: right; width: 100%; font-weight: bold;">
                            <button type="button" class="btn btn-primary" onclick="totalCostCalculator()">Make Payment</button>
                       </div>
                    
                    </div> 
                
                </div>

   
        </div>





        </form>
        
        
        </div>
    
    
    </body>
    
    <script type="text/javascript">
        var temp = [];
        var dropDown = 'DropDown';
        var MAX_NUM_TICKETS =100;
        var SINGLE_DAY_ADULT =20.00;
        var SINGLE_DAY_CHILD =10.00;
        var SINGLE_DAY_YOUTH = 15.00;
        
        var TWO_DAY_ADULT =40.00;
        var TWO_DAY_CHILD =20.00;
        var TWO_DAY_YOUTH =30.00;
        
        var satFrontTotal =0.0;
        var sunFrontTotal =0.0;
        var bothFrontTotal =0.0;
        
        var satBackTotal =0.0;
        var sunBackTotal =0.0;
        var bothBackTotal =0.0;
        
        var totalPayment =0.0
        
        
        var SAT_FRONT_ADULT= "${ticketRows.get(0).getAdultTicketPrice()}";
        var SAT_FRONT_CHILD = "${ticketRows.get(0).getChildTicketPrice()}";
        var SAT_FRONT_YOUTH = "${ticketRows.get(0).getYouthTicketPrice()}";
        
        var SUN_FRONT_ADULT= "${ticketRows.get(1).getAdultTicketPrice()}";
        var SUN_FRONT_CHILD = "${ticketRows.get(1).getChildTicketPrice()}";
        var SUN_FRONT_YOUTH = "${ticketRows.get(1).getYouthTicketPrice()}";  
        
        var BOTH_FRONT_ADULT= "${ticketRows.get(2).getAdultTicketPrice()}";
        var BOTH_FRONT_CHILD = "${ticketRows.get(2).getChildTicketPrice()}";
        var BOTH_FRONT_YOUTH = "${ticketRows.get(2).getYouthTicketPrice()}";        
        
        var SAT_BACK_ADULT= "${ticketRows.get(3).getAdultTicketPrice()}";
        var SAT_BACK_CHILD = "${ticketRows.get(3).getChildTicketPrice()}";
        var SAT_BACK_YOUTH = "${ticketRows.get(3).getYouthTicketPrice()}";
        
        var SUN_BACK_ADULT= "${ticketRows.get(4).getAdultTicketPrice()}";
        var SUN_BACK_CHILD = "${ticketRows.get(4).getChildTicketPrice()}";
        var SUN_BACK_YOUTH = "${ticketRows.get(4).getYouthTicketPrice()}";
        
        var BOTH_BACK_ADULT= "${ticketRows.get(5).getAdultTicketPrice()}";
        var BOTH_BACK_CHILD = "${ticketRows.get(5).getChildTicketPrice()}";
        var BOTH_BACK_YOUTH = "${ticketRows.get(5).getYouthTicketPrice()}";  
        
        var sel = document.createElement('select');
        sel.name = 'drop1';
        //sel.id = 'Select1';
        var ticketNumArr = [];

        for (var i = 0; i <= MAX_NUM_TICKETS; i++) {
           ticketNumArr.push(i);
        }
        tickets = ticketNumArr.map(String);
        //var tickets = ["0","1","2","3","4","5","6","7","8","9","10"
        //];

        var options_str = "";

        tickets.forEach( function(ticket) {
          options_str += '<option value="' + parseInt(ticket) + '">' + ticket + '</option>';
        });

        sel.innerHTML = options_str;

    
        window.onload = function() {
            // Call the methods to generate append dropdown elements
            generateDropDowns();
           
        
    }
    
        /**************************************************************
                This method takes in no arguments and calls the
                createDropDown method to add Select elements
                to the page
        ***************************************************************/   
                        
            var generateDropDowns = function(){
                var ticketSelectors = $( ".ticketSelector" );
                ticketSelectors.each(function(index,element){
                    createDropDowns(element.id);
                    //console.log(element);
                });
            //console.log($( ".ticketSelector" ).get(0));

            }
         /**************************************************************
                This method takes the id of a DOM element appends
                a Select Element with 1-MAX_NUM_TICKETS to it
        ***************************************************************/   
                    
        var createDropDowns = function(idToAppend){
            
                    var selector = document.createElement('select');
                    
                    //selector.name = idToAppend+dropDown;
                    selector.id = idToAppend+dropDown;
                    var ticketNumArr = [];

                    for (var i = 0; i <= MAX_NUM_TICKETS; i++) {
                       ticketNumArr.push(i);
                    }
                    tickets = ticketNumArr.map(String);
                    //var tickets = ["0","1","2","3","4","5","6","7","8","9","10"
                    //];

                    var options_str = "";

                    tickets.forEach( function(ticket) {
                      options_str += '<option value="' + parseInt(ticket) + '">' + ticket + '</option>';
                    });

                    selector.innerHTML = options_str;
                    //selector.onchange= 'totalCostCalculator(this)';
                    //console.log(selector);
            
                    //console.log('.'+idToAppend);
                    $('#'+idToAppend).append(selector);
                    $('#'+idToAppend).on('change',totalCostCalculator);
            
            
        }
        
    var totalCostCalculator = function(){
        
        //console.log($('#adultSatFront').val());
        
        satFrontTotal = $('#adultSatFront'+dropDown).val()*SAT_FRONT_ADULT +   $('#childSatFront'+dropDown).val()*SAT_FRONT_CHILD+$('#youthSatFront'+dropDown).val()*SAT_FRONT_YOUTH ;
        
        sunFrontTotal = $('#adultSunFront'+dropDown).val()*SUN_FRONT_ADULT +   $('#childSunFront'+dropDown).val()*SUN_FRONT_CHILD+$('#youthSunFront'+dropDown).val()*SUN_FRONT_YOUTH ;
        
        bothFrontTotal =$('#adultBothFront'+dropDown).val()*BOTH_FRONT_ADULT +   $('#childBothFront'+dropDown).val()*BOTH_FRONT_CHILD+$('#youthBothFront'+dropDown).val()*BOTH_FRONT_YOUTH ;
        
        
        satBackTotal = $('#adultSatBack'+dropDown).val()*SAT_BACK_ADULT +   $('#childSatBack'+dropDown).val()*SAT_BACK_CHILD +   $('#youthSatBack'+dropDown).val()*SAT_BACK_YOUTH ;
        
        sunBackTotal = $('#adultSunBack'+dropDown).val()*SUN_BACK_ADULT +   $('#childSunBack'+dropDown).val()*SUN_BACK_CHILD+    $('#youthSunBack'+dropDown).val()*SUN_BACK_YOUTH ;
   
        bothBackTotal =$('#adultBothBack'+dropDown).val()*BOTH_BACK_ADULT +   $('#childBothBack'+dropDown).val()*BOTH_BACK_CHILD+ $('#youthBothBack'+dropDown).val()*BOTH_BACK_YOUTH ;
        
        totalPayment =satFrontTotal + sunFrontTotal + bothFrontTotal + satBackTotal + sunBackTotal + bothBackTotal;
        
        totalPayment = totalPayment.toFixed(2);
        $('#totalPayment').text('$'+totalPayment);
        
        console.log(totalPayment);
       
        
    }
    $(document).ready(function() {
    	 //var test = "${ticketRows.get(0).getAdultTicketPrice()}";
    	//console.log('test var '+test);
    $('#ticketForm').formValidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            firstName: {
                row: '.col-xs-6',
                validators: {
                    notEmpty: {
                        message: 'The First Name is required'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'The first name can only consist of alphabetical and space'
                    }
                }
            },
            lastName: {
                row: '.col-xs-6',
                validators: {
                    notEmpty: {
                        message: 'The Last Name is required'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z\s]+$/,
                        message: 'The last name can only consist of alphabetical and space'
                    }
                }
            },
            email: {
                 row: '.col-xs-6',
                validators: {
                    notEmpty: {
                        message: 'The Email Address is required'
                    },
                    emailAddress: {
                        message: 'The input is not a valid Email Address'
                    }
                }            
            },
            phone: {
                row: '.col-xs-6',
                validators: {
                    notEmpty: {
                        message: 'The Phone number is required'
                    }
                }
            },
            addressL1:{
                    validators: {
                    notEmpty: {
                        message: 'The Line 1 Address is required'
                    }
                }
            },
            city:{
                row: '.col-xs-4',
                 validators: {
                 notEmpty: {
                message: 'The City is required'
                    }
                }               
            },
            state:{
                row: '.col-xs-4',
                 validators: {
                 notEmpty: {
                message: 'The State is required'
                    }
                }               
            },
            zip:{
                row: '.col-xs-4',
                 validators: {
                 notEmpty: {
                message: 'The Zip is required'
                    }
                }                
            }
    }
            
    })
    
            .on('err.field.fv', function(e, data) {
            // $(e.target)  --> The field element
            // data.fv      --> The FormValidation instance
            // data.field   --> The field name
            // data.element --> The field element

            data.fv.disableSubmitButtons(false);
        })
        .on('success.field.fv', function(e, data) {
            // e, data parameters are the same as in err.field.fv event handler
            // Despite that the field is valid, by default, the submit button will be disabled if all the following conditions meet
            // - The submit button is clicked
            // - The form is invalid
            data.fv.disableSubmitButtons(false);
        });
});

    
    
    </script>
  </html>