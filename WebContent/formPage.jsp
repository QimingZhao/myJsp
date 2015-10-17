<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Taxing</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" scr="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<%
	String userName = (String) request.getAttribute("userName");
%>
</head>
<body>
	<div class="container">
		<form action="/myJsp/Controller" method="post">
			<a href="/myJsp/Controller?action=backtohomepage" class="navbar-link">退出</a>

			<!-- 个人信息 -->
			<input type="hidden" name="action" value="formSubmit">
			<h3>
				Hello 
				<%=userName%></h3>
			<h1 class="page-header">个人信息</h1>
			<div class="row">
				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Your first name:</label>
						</div>
						<input type="text" class="form-control" placeholder="John"
							name="firstName">
					</div>
				</div>

				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Last name:</label>
						</div>
						<input type="text" class="form-control" placeholder="Doe"
							name="lastName">
					</div>
				</div>

				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Identifying number</label>
						</div>
						<input type="text" class="form-control" placeholder="123-456-7890"
							name="IDNumber">
					</div>
				</div>

				<div class="col-lg-12">
					<div class="form-group">
						<div class="caption">
							<label>Present home address:</label>
						</div>
						<input type="text" class="form-control"
							placeholder="123 Washington St,....." name="homeAddress">
					</div>
				</div>

				<div class="col-lg-12">
					<div class="form-group">
						<div class="caption">
							<label>City,town or post office,state and ZIP:</label>
						</div>
						<input type="text" class="form-control"
							placeholder="hoboken,NJ,07030" name="zipCode">
					</div>
				</div>

				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Foreign country name:</label>
						</div>
						<input type="text" class="form-control" placeholder="China"
							name="foreignCountry">
					</div>
				</div>

				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Foreign provice/state/county:</label>
						</div>
						<input type="text" class="form-control" placeholder="Peking"
							name="foreignState">
					</div>
				</div>

				<div class="col-lg-4">
					<div class="form-group">
						<div class="caption">
							<label>Post code:</label>
						</div>
						<input type="text" class="form-control" placeholder="01000"
							name="foreignZip">
					</div>
				</div>

				<div class="col-lg-3">
					<div class="form-group">
						<input type="checkbox" value="0" name="maritalStatus"> <label
							for="">Single nonresident alien</label>
					</div>
				</div>

				<div class="col-lg-3">
					<div class="form-group">
						<input type="checkbox" value="1" name="maritalStatus"> <label
							for="">Married nonresident alien</label>
					</div>
				</div>
			</div>


			<!-- 收入相关 -->
			<h1 class="page-header">收入相关</h1>
			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">3 Wages,
					salaries, tips, etc. Attach Form(s) W-2 . . . . . . . . . . . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_3">
				</div>
				fill3
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">4 Taxable
					refunds, credits, or offsets of state and local income taxes . . .
					. . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_4">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">5 Scholarship
					and fellowship grants. Attach Form(s) 1042-S or required statement.
					.</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_5">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">6 Total income
					exempt by a treaty from page 2, Item J(1)(e) </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_6">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">7 Add lines 3,
					4, and 5 . . . . . . . . . . . . . . . . . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_7">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">8 Scholarship
					and fellowship grants excluded . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_8">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">9 Student loan
					interest deduction . . . . . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_9">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">10 Subtract the
					sum of line 8 and line 9 from line 7. This is your adjusted gross
					income . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_10">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">11 Itemized
					deductions (see instructions) . . . . . . . . . . . . . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_11">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">12 Subtract
					line 11 from line 10 . . . . . . . . . . . . . . . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_12">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">13 Exemption
					(see instructions) . . . . . . . . . . . . . . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_13">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">14 Taxable
					income. Subtract line 13 from line 12. If line 13 is more than line
					12, enter -0-</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_14">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">15 Tax. Find
					your tax in the tax table in the instructions . . . . . . . . . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_15">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">16 Unreported
					social security and Medicare tax from Form:</label>
				<div class="col-lg-2 ">
					<div class="checkbox">
						<label for=""> a<input type="checkbox" value="4137"
							name="fill_16_check">4137
						</label>
					</div>
				</div>
				<div class="col-lg-2 ">
					<div class="checkbox">
						<label for=""> b<input type="checkbox" value="8919"
							name="fill_16_check">8919
						</label>
					</div>
				</div>
				<div class="col-lg-3">
					<input type="text" class="form-control" name="fill_16">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">17 Add lines 15
					and 16. This is your total tax . . . . . . . . . . . . . </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_17">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">18a Federal
					income tax withheld from Form(s) W-2 and 1099-R </label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_18a">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">18b Federal
					income tax withheld from Form(s) 1042-S . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_18b">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">19 2014
					estimated tax payments and amount applied from 2013 return</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_19">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">20 Credit for
					amount paid with Form 1040-C . . . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_20">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">21 Add lines
					18a through 20. These are your total payments . . . . . . . .</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_21">
				</div>
			</div>


			<h1 class="page-header">返税相关</h1>
			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">22 If line 21
					is more than line 17, subtract line 17 from line 21. This is the
					amount you overpaid</label>
				<div class="col-lg-7">
					<input type="text" class="form-control" name="fill_22">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-5 control-label">23a Amount of
					line 22 you want refunded to you. If Form 8888 is attached, check
					here</label>
				<div class="col-lg-1">
					<input type="checkbox" class="form-control" name="fill_23a">
				</div>
			</div>

			<div class="form-group" style="height: 50px;">
				<label for="" class="col-sm-3 control-label">23b Routing
					number</label>
				<div class="col-lg-4">
					<input type="text" class="form-control" name="fill_23b">
				</div>
				<div class="form-group" style="height: 50px;">
					<label for="" class="col-sm-1 control-label">23c Type: </label>
					<div class="col-xs-1">
						<input type="checkbox" class="form-control" value="checking"
							name="fill_23c_check">
					</div>
					<label for="" class="col-sm-1 control-label">Checking</label>
					<div class="col-xs-1">
						<input type="checkbox" class="form-control" value="saving"
							name="fill_23c_check">
					</div>
					<label for="" class="col-sm-1 control-label">Saving</label>
				</div>

				<div class="form-group" style="height: 50px;">
					<label for="" class="col-sm-5 control-label">23d Account
						number</label>
					<div class="col-lg-7">
						<input type="checkbox" class="form-control" name="fill_23d">
					</div>
				</div>

				<div class="form-group" style="height: 50px;">
					<label for="" class="col-sm-5 control-label">23e If you
						want your refund check mailed to an address outside the United
						States not shown above, enter that address here:</label>
					<div class="col-lg-7">
						<input type="checkbox" class="form-control" name="fill_23e">
					</div>
				</div>

				<div class="form-group" style="height: 50px;">
					<label for="" class="col-sm-5 control-label">24 Amount of
						line 22 you want applied to your 2015 estimated tax </label>
					<div class="col-lg-7">
						<input type="checkbox" class="form-control" name="fill_24">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-5">
						<!-- <button class="btn btn-primary">登录</button>  -->
						<button class="submit">提交</button>
					</div>
				</div>
		</form>

	</div>


	<!-- ------------------------表单部分结束--------------------- -->


	<div style="height: 800px;"></div>
</body>
</html>