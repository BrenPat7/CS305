# CS305

Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a consulting company who specializes in personalized financial plans for its customers. This company wanted Global rain and me to modernize its operations. It wanted to be on the most secure yet practical solution for its customers data in order to stay protected from external threats.

What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

The part which I succeeded the most in was the ability to identify a efficient algorithm to help them meet their goals. It is important to code securely because hackers are constantly on the prowl looking for quick ways to take advantage of those who lie waiting. The faster we can identify potential threats, the faster we can produce an optimal defense against them. From the ground, having elevated level of software security not only helps a company's brand and image, but it also ensures they stay on the good side of privacy regulators and potential lawsuits. It can maintain their ability to be successful, especially when their primary objective has to do with an individualized approach to consumer finances, there is a plentiful amount of information hackers would love to steal from their servers. So, if they hit the ground running, they would be far less vulnerable to threats. Start strong.

Which part of the vulnerability assessment was challenging or helpful to you?
How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I think the hardest part of the vulnerability assessment was being able to interpret the information from the dependency check, as when we first did the assessment, there was a bucket load of "potential" threats. It is important to be able to understand each one of the dependencies and identify what was actually a problem and what was a false positive. I increased layers of security by adding an algorithm SHA256 to help encrypt data, and also by ensuring the dependencies were verified as unresolvable or needing to be updated. In future, I would definitely spend some time going through OWASP.org and finding common risks, and I will attempt to code in ways that makes a meaningful effort to sway away from these risks.

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I made certain my code and software applications were functional and secure by running the standard industry tests, by ensuring there were no errors coming up in the IDE, and by identifying what is the minimum required standards for encryption in the industry. I ran more dependency tests after I refactored the code to see if the previous potential threats were resolved and if any new ones appeared.

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

For industry standards, I used OWASP.org. It will be of use in future for ensuring I am on top of all common threats which are currently affecting the industry.

Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I think the ability to create a Certificate for SSL certification would be especially useful knowledge with future employers. I actually was running to an issue with a computers VPN at my work, I am in IT and had to resolve a problem someone had on their machine. I knew that the VPN application we were using was rerouting data through their servers, which means there must be a Certificate to install on the machine. I found the certificate through their website and after installing it the issue was resolved.
