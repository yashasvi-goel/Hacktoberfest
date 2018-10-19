program decbin;
var
	n, pot2: integer;
begin

	writeln('------DECIMAL TO BINARY CONVERTER------');
	writeln;
	write('Type a number and press enter: ');
	read(n);
	writeln;

	pot2:=1	;

	while n >= pot2 do
		pot2:=pot2*2;
	pot2:=pot2 div 2;
	
	while pot2>0 do
	begin	
		if n >= pot2 then	
		begin	
			write(1);
			n:=n-pot2;
		end
		else
			write(0);			
		pot2:= pot2 div 2;	
	end;
	writeln;

end.
