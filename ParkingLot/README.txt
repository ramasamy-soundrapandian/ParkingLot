Design a Parking Lot using Java.

Solution : 

This is a Parking lot system designed using object oriented principles in Java.

The objects in my design are the actual ParkingLot, Levels, Spots and Vehicles

ParkingLot - A parkinglot is made up of 'n' number of levels/floors and 'm' number of slots per floor.

Levels - Each level is an independent entity with a floor number, its lanes and the spots within it. The number of lanes are designed based on the number of spots. 

Slots - The spots are considered as the independednt entities to each other where in the type of the vehicle is considered to fill the slot.

Vehicles - Object with plateno and their type. A vehicle has the attributes of licenseplate.

I have considered Levels and Spots as entities that are independent so that any level can be added with a desired number of spots later.Each time a vehicle comes in or goes out.Also the available spots are updated in the particular level.

Methods: ParkVehicle - This operation inserts a vehicle accordingly. Leave Operation - This operations exits a vehicle 'C' in a level 'm'.

Main Program :

I have taken a small example with 2 slots per floor and the number of levels are hard coded as n = 2 (As told by the interviewer,which can also be given by the user later, if required). That means,a total of 4 vehicles can be parked. For the fifth vehicle, it says Parking FULL.

To park vechile: park plateno - Example - park 1234

To leave the parking lot : leave plateno level - Example - leave 1234 1
